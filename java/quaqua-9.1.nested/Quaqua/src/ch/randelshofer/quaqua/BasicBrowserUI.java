/*
 * @(#)BasicBrowserUI.java  
 *
 * Copyright (c) 2005-2013 Werner Randelshofer, Switzerland.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */
package ch.randelshofer.quaqua;

import ch.randelshofer.quaqua.datatransfer.*;
import java.awt.datatransfer.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.tree.*;

/**
 * BasicBrowserUI.
 *
 * @author  Werner Randelshofer
 * @version $Id: BasicBrowserUI.java 462 2014-03-22 09:23:12Z wrandelshofer $
 */
public class BasicBrowserUI extends BrowserUI {

    protected JBrowser browser;
    public Icon sizeHandleIcon;

    /**
     * Creates a new instance.
     */
    public BasicBrowserUI() {
    }

    //
    // Install methods
    //
    @Override
    public void installUI(JComponent c) {
        c.setBackground(UIManager.getColor("List.background"));
        c.setFont(UIManager.getFont("List.font"));
        sizeHandleIcon = UIManager.getIcon("Browser.sizeHandleIcon");
        if (sizeHandleIcon == null) {
           sizeHandleIcon = new ImageIcon(BasicBrowserUI.class.getResource("images/Browser.sizeHandleIcon.png"));
        }

        browser = (JBrowser) c;
        installDefaults();
    }

    protected void installDefaults() {
        if (browser.getColumnCellRenderer() == null ||
                (browser.getColumnCellRenderer() instanceof UIResource)) {
            browser.setColumnCellRenderer(createCellRenderer());
        }
	TransferHandler th = browser.getTransferHandler();
	if (th == null || th instanceof UIResource) {
	    browser.setTransferHandler(defaultTransferHandler);
	}
    }
    //
    // Uninstall methods
    //

    @Override
    public void uninstallUI(JComponent c) {
	uninstallDefaults();
    }
    protected void uninstallDefaults() {
	if (browser.getTransferHandler() instanceof UIResource) {
	    browser.setTransferHandler(null);
	}
    }
    
    @Override
    public Icon getSizeHandleIcon() {
        return sizeHandleIcon;
    }

    protected ListCellRenderer createCellRenderer() {
        return new DefaultColumnCellRenderer.UIResource(browser);
    }
    private static final TransferHandler defaultTransferHandler = new BrowserTransferHandler();

    static class BrowserTransferHandler extends TransferHandler implements UIResource/*, Comparator*/ {

        private JBrowser browser;

        /**
         * Create a Transferable to use as the source for a data transfer.
         *
         * @param c  The component holding the data to be transfered.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @return  The representation of the data to be transfered. 
         *  
         */
        @Override
        protected Transferable createTransferable(JComponent c) {
            while (c != null && !(c instanceof JBrowser)) {
                c = (c.getParent() instanceof JComponent) ? (JComponent) c.getParent() : null;
            }

            if (c != null) {
                browser = (JBrowser) c;
                TreePath[] paths = browser.getSelectionPaths();

                if (paths == null || paths.length == 0) {
                    return null;
                }

                StringBuffer plainBuf = new StringBuffer();
                StringBuffer htmlBuf = new StringBuffer();

                htmlBuf.append("<html>\n<body>\n<ul>\n");

                TreeModel model = browser.getModel();
                TreePath lastPath = null;
                TreePath[] displayPaths = getDisplayOrderPaths(paths);

                for (int i = 0; i < displayPaths.length; i++) {
                    TreePath path = displayPaths[i];

                    Object node = path.getLastPathComponent();
                    boolean leaf = model.isLeaf(node);
                    String label = getDisplayString(path, true, leaf);

                    plainBuf.append(label + "\n");
                    htmlBuf.append("  <li>" + label + "\n");
                }

                // remove the last newline
                plainBuf.deleteCharAt(plainBuf.length() - 1);
                htmlBuf.append("</ul>\n</body>\n</html>");

                browser = null;

                CompositeTransferable t = new CompositeTransferable();
                t.add(new DefaultTransferable(htmlBuf.toString(), "text/html", "HTML"));
                t.add(new DefaultTransferable(plainBuf.toString(), "text/plain", "Text"));
                return t;
            }

            return null;
        }
        /*	
        public int compare(Object o1, Object o2) {
        int row1 = browser.getRowForPath((TreePath)o1);
        int row2 = browser.getRowForPath((TreePath)o2);
        return row1 - row2;
        }
         */

        String getDisplayString(TreePath path, boolean selected, boolean leaf) {
            Object node = path.getLastPathComponent();
            if (node != null) {
                String sValue = node.toString();
                if (sValue != null) {
                    return sValue;
                }
            }
            return "";
        }

        /**
         * Selection paths are in selection order.  The conversion to
         * HTML requires display order.  This method resorts the paths
         * to be in the display order.
         */
        TreePath[] getDisplayOrderPaths(TreePath[] paths) {
            // sort the paths to display order rather than selection order
            ArrayList selOrder = new ArrayList();
            for (int i = 0; i < paths.length; i++) {
                selOrder.add(paths[i]);
            }
            //Collections.sort(selOrder, this);
            int n = selOrder.size();
            TreePath[] displayPaths = new TreePath[n];
            for (int i = 0; i < n; i++) {
                displayPaths[i] = (TreePath) selOrder.get(i);
            }
            return displayPaths;
        }

        public int getSourceActions(JComponent c) {
            return COPY;
        }
    }
}
