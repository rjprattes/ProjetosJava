insert into cozinha (id,nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into permissao (id, nome, descricao) values (1, 'EDITAR_COZINHAS', 'Permite editar uma cozinha existente.');

insert into cidade (id, nome) values (1, 'Vitória');
insert into estado (id, nome) values (1, 'ES');

insert into restaurante (nome, taxa_frete,  cozinha_id) values ('La Fornalha', 10, 2);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Bueno', 9.50, 1);

insert into forma_pagamento (id, nome) values (1, 'Cartão');