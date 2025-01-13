ALTER TABLE topicos
ADD respostas_id BIGINT,
ADD CONSTRAINT fk_topicos_respostas_id FOREIGN KEY (respostas_id) REFERENCES respostas (id);