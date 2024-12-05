-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16-Out-2024 às 19:19
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `cinema`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bilheteria`
--

CREATE TABLE `bilheteria` (
  `Id_Bilheteria` int(7) NOT NULL,
  `Id_Cartaz` int(7) NOT NULL,
  `Id_Filmes` int(7) NOT NULL,
  `Senha` int(8) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cartaz`
--

CREATE TABLE `cartaz` (
  `Id_Cartaz` int(7) NOT NULL,
  `Id_Filmes` int(7) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `filmes`
--

CREATE TABLE `filmes` (
  `Id_Filmes` int(7) NOT NULL,
  `Faixa` varchar(3) NOT NULL,
  `Titulo` varchar(100) NOT NULL,
  `Sinopse` varchar(1000) NOT NULL,
  `Genero` varchar(30) NOT NULL,
  `Duracao` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Senha` int(8) NOT NULL,
  `Nome` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`Senha`, `Nome`) VALUES
(12345678, 'Rodrigo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingresso`
--

CREATE TABLE `ingresso` (
  `Nota_Fiscal` int(7) NOT NULL,
  `Id_Filmes` int(7) NOT NULL,
  `Id_Salas` int(7) NOT NULL,
  `Valor` decimal(7,0) NOT NULL,
  `Condicao` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `salas`
--

CREATE TABLE `salas` (
  `Id_Salas` int(7) NOT NULL,
  `Id_Filmes` int(7) NOT NULL,
  `Numero` int(2) NOT NULL,
  `Assento` int(3) NOT NULL,
  `Tecnologia` varchar(20) NOT NULL,
  `Idioma` varchar(20) NOT NULL,
  `Horario` time(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `bilheteria`
--
ALTER TABLE `bilheteria`
  ADD PRIMARY KEY (`Id_Bilheteria`),
  ADD KEY `Id_Cartaz` (`Id_Cartaz`),
  ADD KEY `Id_Filmes` (`Id_Filmes`);

--
-- Índices para tabela `cartaz`
--
ALTER TABLE `cartaz`
  ADD PRIMARY KEY (`Id_Cartaz`),
  ADD KEY `Id_Filmes` (`Id_Filmes`);

--
-- Índices para tabela `filmes`
--
ALTER TABLE `filmes`
  ADD PRIMARY KEY (`Id_Filmes`);

--
-- Índices para tabela `ingresso`
--
ALTER TABLE `ingresso`
  ADD PRIMARY KEY (`Nota_Fiscal`),
  ADD KEY `Id_Filmes` (`Id_Filmes`),
  ADD KEY `Id_Salas` (`Id_Salas`);

--
-- Índices para tabela `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`Id_Salas`),
  ADD KEY `Id_Filmes` (`Id_Filmes`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `bilheteria`
--
ALTER TABLE `bilheteria`
  MODIFY `Id_Bilheteria` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `cartaz`
--
ALTER TABLE `cartaz`
  MODIFY `Id_Cartaz` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `filmes`
--
ALTER TABLE `filmes`
  MODIFY `Id_Filmes` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `ingresso`
--
ALTER TABLE `ingresso`
  MODIFY `Nota_Fiscal` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `salas`
--
ALTER TABLE `salas`
  MODIFY `Id_Salas` int(7) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
