CREATE TABLE bibliotecario(
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            nome VARCHAR(250) UNIQUE,
                            email VARCHAR(250)
);

CREATE TABLE emprestimo(
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            livro_id BIGINT NOT NULL,
                            membro_id BIGINT NOT NULL,
                            dataEmprestimo DATE NOT NULL,
                            dataDevolucao DATE NOT NULL
);

CREATE TABLE livro (
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            titulo VARCHAR(250) NOT NULL,
                            autor VARCHAR(250),
                            anoPublicacao NUMERIC
);

CREATE TABLE membro(
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            nome VARCHAR(250) NOT NULL,
                            endereco VARCHAR(500),
                            telefone VARCHAR(50)
);

CREATE TABLE visitante(
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            nome VARCHAR(250) NOT NULL,
                            telefone VARCHAR(250)
);
