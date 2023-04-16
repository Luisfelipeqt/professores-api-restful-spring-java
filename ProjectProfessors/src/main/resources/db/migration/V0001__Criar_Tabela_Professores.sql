CREATE TABLE IF NOT EXISTS `professores` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `nome` VARCHAR(100) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `idade` INTEGER NOT NULL,
    `descricao` TEXT NOT NULL,
    `valor_hora` DECIMAL(5,2) NOT NULL,
    `foto_perfil` VARCHAR(100),
    `password` VARCHAR(255) NOT NULL,
    `created_at` DATETIME NOT NULL,
    `updated_at` DATETIME NOT NULL
);