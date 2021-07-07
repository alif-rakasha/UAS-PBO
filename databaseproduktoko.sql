-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2021 at 10:02 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `databasetoko`
--

-- --------------------------------------------------------

--
-- Table structure for table `produktoko`
--

CREATE TABLE `produktoko` (
  `kodeProduk` varchar(20) NOT NULL,
  `namaProduk` varchar(100) NOT NULL,
  `kategoriProduk` varchar(50) NOT NULL,
  `namaProdusen` varchar(100) NOT NULL,
  `deskripsiProduk` varchar(500) NOT NULL,
  `hargaProduk` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produktoko`
--

INSERT INTO `produktoko` (`kodeProduk`, `namaProduk`, `kategoriProduk`, `namaProdusen`, `deskripsiProduk`, `hargaProduk`) VALUES
('P073_0225', 'Buku Gambar Ukuran A5 100 Lembar KERTASTE', 'Alat Tulis', 'PT. KERTASTE', 'Produk buku gambar dengan ukuran kertas A5, berisi 100 lembar.', 17100),
('P123_0001', 'Sweetea Minuman Teh Rasa Vanilla Boba', 'Minuman', 'PT. Sugarsweet Tea Industry Indonesia', 'Produk teh kemasan botol yang memiliki perisa Vanilla dengan tambahan Boba di dalamnya.', 7300),
('P155_0012', 'Chocomelt Varian White Chocolate', 'Gula-Gula/Coklat', 'PT. Milky Way', 'Produk cokelat batangan dengan varian White Chocolate (cokelat putih). Cokelat ini akan meleleh/lumer secara cepat saat berada di mulut. Satu kemasan berisi satu bar yang dapat dibagi menjadi 16 potongan.', 14800),
('P174_0188', 'Bumbu Masak Instan Makanlu Nasi Goreng', 'Bumbu Dapur', 'PT. Kitamakan', 'Produk bumbu masak instan nasi goreng. Dapat dipakai untuk 4-6 porsi.', 4600),
('P202_0079', 'Puzzle Bergambar Kendaraan', 'Mainan Anak', 'PT. Toy Story', 'Produk mainan anak berupa puzzle dengan gambar kendaraan. Berisi 24 potongan puzzle..', 25900);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produktoko`
--
ALTER TABLE `produktoko`
  ADD PRIMARY KEY (`kodeProduk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
