create table respostas(

    id bigint not null auto_increment,
    mensagem varchar(255) not null unique,
    topico_id bigint not null,
    data datetime not null,
    autor_id bigint not null,

    primary key(id)

);