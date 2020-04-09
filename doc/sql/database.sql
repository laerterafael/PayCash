-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.7-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para paycash
CREATE DATABASE IF NOT EXISTS `paycash` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `paycash`;

-- Copiando estrutura para tabela paycash.cargo
CREATE TABLE IF NOT EXISTS `cargo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(11) NOT NULL,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela paycash.cargo: ~4 rows (aproximadamente)
DELETE FROM `cargo`;
/*!40000 ALTER TABLE `cargo` DISABLE KEYS */;
INSERT INTO `cargo` (`id`, `codigo`, `nome`) VALUES
	(1, 1001, 'Gerente'),
	(2, 1002, 'Supervisor'),
	(3, 1003, 'Financeiro'),
	(6, 1004, 'Vendedor');
/*!40000 ALTER TABLE `cargo` ENABLE KEYS */;

-- Copiando estrutura para tabela paycash.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(11) NOT NULL DEFAULT 0,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `sexo` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `cpf` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `rg` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `data_nasc` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `telefone` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `salario` double NOT NULL DEFAULT 0,
  `cargo_id` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `FK_funcionario_cargo` (`cargo_id`),
  CONSTRAINT `FK_funcionario_cargo` FOREIGN KEY (`cargo_id`) REFERENCES `cargo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela paycash.funcionario: ~3 rows (aproximadamente)
DELETE FROM `funcionario`;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`id`, `codigo`, `nome`, `sexo`, `cpf`, `rg`, `data_nasc`, `telefone`, `salario`, `cargo_id`) VALUES
	(1, 1, 'Laerte Rafael', 'Masculino', '1391829', '23718', '09/11/1990', '81564654', 7500, 1),
	(2, 2, 'Fulano de Tal', 'Masculino', '54432185', '1223123', '09/05/2001', '8185625658', 1500, 2),
	(3, 3, 'Maria do Bairro', 'Feminino', '8482454454', '342847', '11/08/1998', '81845481214', 1045, 6);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;

-- Copiando estrutura para tabela paycash.pagamento
CREATE TABLE IF NOT EXISTS `pagamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `valor` double NOT NULL DEFAULT 0,
  `data` date NOT NULL DEFAULT '0000-00-00',
  `status` int(11) NOT NULL DEFAULT 0,
  `funcionario_id` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `FK_Pagamento_Funcionario` (`funcionario_id`),
  CONSTRAINT `FK_Pagamento_Funcionario` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela paycash.pagamento: ~3 rows (aproximadamente)
DELETE FROM `pagamento`;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` (`id`, `valor`, `data`, `status`, `funcionario_id`) VALUES
	(1, 7500, '2020-04-08', 1, 1),
	(3, 1250, '2020-04-15', 2, 2),
	(4, 1046, '2020-05-06', 3, 3);
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;

-- Copiando estrutura para tabela paycash.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tipo` tinyint(4) NOT NULL DEFAULT 0,
  `status` tinyint(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela paycash.usuario: ~2 rows (aproximadamente)
DELETE FROM `usuario`;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id`, `login`, `senha`, `tipo`, `status`) VALUES
	(1, 'admin', 'admin', 1, 1),
	(2, 'gerencia', '123456', 2, 1),
	(3, 'supervisao', '123456', 3, 1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
