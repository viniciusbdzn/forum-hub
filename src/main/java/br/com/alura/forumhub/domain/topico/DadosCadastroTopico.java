package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.autor.DadosCadastroAutor;
import br.com.alura.forumhub.domain.curso.DadosCadastroCurso;
import br.com.alura.forumhub.domain.resposta.Resposta;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotNull
        LocalDateTime data,

        @NotNull
        @Valid
        DadosCadastroAutor autor,

        @NotNull
        @Valid
        DadosCadastroCurso curso,

        Resposta respostas
) {
}
