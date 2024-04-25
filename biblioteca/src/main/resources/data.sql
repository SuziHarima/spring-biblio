INSERT INTO bibliotecario(nome, email)
values ('bibliotecarioExemplo1', 'bibliotecarioExemplo1@gmail.com');


INSERT INTO emprestimo(livro_id, membro_id, dataEmprestimo, dataDevolucao)
values(1, 1, 24/01/2024, 01/05/2024);


INSERT INTO livro (titulo, autor, anoPublicacao)
values('tituloExemplo1', 'AutorExemplo1', 1989);

INSERT INTO membro(nome, endereco, telefone)
values('membroExemplo1', 'rua exemplo, cidade exemplo', '1235996-88513');


INSERT INTO visitante(nome, telefone)
values ('visitanteExemplo', '9968546-99999');
