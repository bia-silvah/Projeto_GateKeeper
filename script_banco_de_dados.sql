CREATE DATABASE IF NOT EXISTS gatekeeper_db;
USE gatekeeper_db;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    chave_acesso VARCHAR(255) NOT NULL
);

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL
);

CREATE TABLE acessos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT NOT NULL,
    data_hora DATETIME NOT NULL,
    tipo_acesso ENUM('entrada', 'saida') NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);