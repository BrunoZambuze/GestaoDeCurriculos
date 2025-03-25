CREATE TABLE usuario (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL
) ENGINE = innodb;

CREATE TABLE usuario_recrutador (
	id_usuario INT NOT NULL PRIMARY KEY,
    nome_empresa VARCHAR(100) NOT NULL
) ENGINE = innodb;
ALTER TABLE usuario_recrutador ADD CONSTRAINT fk_usuario_recrutador FOREIGN KEY(id_usuario) REFERENCES usuario(id) ON DELETE CASCADE;

CREATE TABLE usuario_candidato(
	id_usuario INT NOT NULL PRIMARY KEY,
    area_atuacao VARCHAR(100) NOT NULL
) ENGINE = innodb;
ALTER TABLE usuario_candidato ADD CONSTRAINT fk_usuario_candidato FOREIGN KEY(id_usuario) REFERENCES usuario(id) ON DELETE CASCADE;