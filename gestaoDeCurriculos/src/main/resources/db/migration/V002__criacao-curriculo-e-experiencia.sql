CREATE TABLE curriculo (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    arquivo LONGBLOB,
    nome_arquivo VARCHAR(255) NOT NULL,
    tipo_arquivo VARCHAR(100) NOT NULL,
    fk_id_candidato INT NOT NULL UNIQUE
) ENGINE = innodb;
ALTER TABLE curriculo ADD CONSTRAINT fk_curriculo_candidato FOREIGN KEY (fk_id_candidato) REFERENCES usuario_candidato(id_usuario) ON DELETE CASCADE;

CREATE TABLE experiencia (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim Date,
    fk_id_candidato INT NOT NULL
) ENGINE = innodb;
ALTER TABLE experiencia ADD CONSTRAINT fk_experiencia_candidato FOREIGN KEY (fk_id_candidato) REFERENCES usuario_candidato(id_usuario) ON DELETE CASCADE;