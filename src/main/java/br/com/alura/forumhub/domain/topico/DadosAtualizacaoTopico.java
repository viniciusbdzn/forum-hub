package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.resposta.Resposta;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        Resposta respostas
) {
}
