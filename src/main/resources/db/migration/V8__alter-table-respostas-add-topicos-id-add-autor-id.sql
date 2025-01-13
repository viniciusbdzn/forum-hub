ALTER TABLE respostas
ADD CONSTRAINT fk_respostas_topico_id FOREIGN KEY (topico_id) REFERENCES topicos (id),
ADD CONSTRAINT fk_respostas_autor_id FOREIGN KEY (autor_id) REFERENCES autores (id);