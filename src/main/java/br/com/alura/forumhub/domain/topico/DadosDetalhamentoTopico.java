package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.autor.Autor;
import br.com.alura.forumhub.domain.curso.Curso;

public record DadosDetalhamentoTopico(
        String titulo,
        String mensagem,
        Autor autor,
        Curso curso
) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso());
    }
}
