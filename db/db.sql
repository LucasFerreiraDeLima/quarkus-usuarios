CREATE TABLE quarkus-users;

CREATE TABLE USERS (
	id bigserial not null primary key,
	name varchar(100) not null,
	sobrenome varchar(100) not null,
	age integer not null,
	cidadeNascimento varchar(100) not null,
	cpf integer not null

)