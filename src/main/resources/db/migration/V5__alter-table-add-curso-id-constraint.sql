alter table topicos
add constraint fk_topicos_curso_id foreign key(curso_id) references cursos(id);