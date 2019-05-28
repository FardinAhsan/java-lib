-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2017 at 05:46 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `department_store_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `category_id` int(11) NOT NULL DEFAULT '0',
  `unit_id` int(11) NOT NULL DEFAULT '0',
  `status` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `category_id`, `unit_id`, `status`) VALUES
(1, 'alo', 2, 1, 0),
(2, 'milk', 2, 2, 0),
(3, 'egg', 2, 4, 0),
(4, 'pen', 1, 4, 1),
(5, 'pencile', 1, 4, 0),
(6, 'file', 1, 4, 0),
(7, 'balb', 3, 4, 0),
(8, 'fan', 3, 4, 0);

-- --------------------------------------------------------

--
-- Table structure for table `product_category`
--

CREATE TABLE `product_category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_category`
--

INSERT INTO `product_category` (`id`, `name`, `status`) VALUES
(1, 'aljfdsl', 0),
(2, 'Grocer', 0),
(3, 'Electronics', 0),
(4, 'jalj', 0);

-- --------------------------------------------------------

--
-- Table structure for table `product_unit`
--

CREATE TABLE `product_unit` (
  `id` int(11) NOT NULL,
  `name` varchar(10) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_details`
--

CREATE TABLE `purchase_details` (
  `master_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quentity` int(11) NOT NULL,
  `buy_price` double NOT NULL,
  `total` double NOT NULL,
  `sale_price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase_details`
--

INSERT INTO `purchase_details` (`master_id`, `product_id`, `quentity`, `buy_price`, `total`, `sale_price`) VALUES
(2, 8, 10, 1000, 10000, 1500),
(2, 7, 10, 1000, 10000, 1500),
(2, 1, 10, 10, 100, 15),
(2, 2, 41, 20, 820, 25),
(3, 1, 10, 10, 100, 15),
(4, 1, 10, 10, 100, 15),
(4, 3, 100, 10, 1000, 12),
(5, 2, 10, 10, 100, 16),
(6, 2, 10, 10, 100, 16),
(6, 8, 10, 1000, 10000, 1500),
(7, 2, 10, 10, 100, 16),
(7, 8, 10, 1000, 10000, 1500),
(7, 1, 10, 10, 100, 14),
(8, 2, 10, 10, 100, 16),
(8, 8, 10, 1000, 10000, 1500),
(8, 1, 10, 10, 100, 14),
(9, 2, 232, 23, 5336, 232);

-- --------------------------------------------------------

--
-- Table structure for table `purchase_master`
--

CREATE TABLE `purchase_master` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `vendor` varchar(255) NOT NULL,
  `total` int(11) NOT NULL,
  `paid` int(11) NOT NULL,
  `due` int(11) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase_master`
--

INSERT INTO `purchase_master` (`id`, `date`, `vendor`, `total`, `paid`, `due`, `status`) VALUES
(1, '2017-04-29', 'fardin', 20100, 20000, 100, 0),
(2, '2017-04-29', 'fardin', 20920, 20900, 20, 0),
(3, '2017-04-30', 'fardin', 100, 80, 20, 0),
(4, '2017-04-30', 'ahsan', 1100, 1100, 0, 0),
(5, '2017-04-30', 'shafi', 100, 100, 0, 0),
(6, '2017-04-29', 'lkafld', 10100, 10000, 100, 1),
(7, '2017-04-30', 'lfajlf', 10200, 10000, 200, 1),
(8, '2017-04-30', 'lfajlf', 10200, 10000, 200, 1),
(9, '2017-04-06', 'ewe', 5336, 222, 5114, 1);

-- --------------------------------------------------------

--
-- Table structure for table `purchase_temp`
--

CREATE TABLE `purchase_temp` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quentity` int(11) NOT NULL,
  `buy_price` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `sale_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase_temp`
--

INSERT INTO `purchase_temp` (`id`, `product_id`, `quentity`, `buy_price`, `total`, `sale_price`) VALUES
(1, 2, 232, 23, 5336, 232);

-- --------------------------------------------------------

--
-- Table structure for table `sales_deatils`
--

CREATE TABLE `sales_deatils` (
  `master_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quentity` int(11) NOT NULL,
  `sale_price` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_deatils`
--

INSERT INTO `sales_deatils` (`master_id`, `product_id`, `quentity`, `sale_price`, `total`) VALUES
(1, 2, 20, 10, 200),
(1, 7, 10, 80, 800);

-- --------------------------------------------------------

--
-- Table structure for table `sales_master`
--

CREATE TABLE `sales_master` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `customer` varchar(255) NOT NULL,
  `total` int(11) NOT NULL,
  `paid` int(11) NOT NULL,
  `due` int(11) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_master`
--

INSERT INTO `sales_master` (`id`, `date`, `customer`, `total`, `paid`, `due`, `status`) VALUES
(1, '2017-05-01', 'fardin', 1000, 1000, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `sales_temp`
--

CREATE TABLE `sales_temp` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quentity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `status_name` varchar(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`id`, `status_name`) VALUES
(-1, 'select'),
(0, 'Enable'),
(1, 'Disable');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_category`
--
ALTER TABLE `product_category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_unit`
--
ALTER TABLE `product_unit`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `purchase_master`
--
ALTER TABLE `purchase_master`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `purchase_temp`
--
ALTER TABLE `purchase_temp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales_master`
--
ALTER TABLE `sales_master`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales_temp`
--
ALTER TABLE `sales_temp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `product_category`
--
ALTER TABLE `product_category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `product_unit`
--
ALTER TABLE `product_unit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `purchase_master`
--
ALTER TABLE `purchase_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `purchase_temp`
--
ALTER TABLE `purchase_temp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `sales_master`
--
ALTER TABLE `sales_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `sales_temp`
--
ALTER TABLE `sales_temp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
