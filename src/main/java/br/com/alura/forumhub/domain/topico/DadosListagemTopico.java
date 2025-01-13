package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.autor.Autor;
import br.com.alura.forumhub.domain.curso.Curso;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        EstadoDoTopico estadoDoTopico,
        Autor autor,
        Curso curso
) {
    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(),
                topico.getEstadoDoTopico(), topico.getAutor(), topico.getCurso());
    }
}
