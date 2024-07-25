-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Tempo de geração: 25/07/2024 às 03:26
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `loja_db`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `produtos_tb`
--

CREATE TABLE `produtos_tb` (
  `ID` smallint(3) NOT NULL COMMENT 'ID dos produtos.',
  `Nome` varchar(40) NOT NULL COMMENT 'Nome dos produtos.',
  `Marca` varchar(25) NOT NULL COMMENT 'Marca fabricante dos produtos.',
  `Valor` decimal(6,2) NOT NULL COMMENT 'Valor dos produtos.',
  `Estoque` smallint(4) NOT NULL COMMENT 'Quantidade do mesmo produto.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `produtos_tb`
--
ALTER TABLE `produtos_tb`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos_tb`
--
ALTER TABLE `produtos_tb`
  MODIFY `ID` smallint(3) NOT NULL AUTO_INCREMENT COMMENT 'ID dos produtos.';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
