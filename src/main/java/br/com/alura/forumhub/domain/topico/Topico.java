package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.autor.Autor;
import br.com.alura.forumhub.domain.curso.Curso;
import br.com.alura.forumhub.domain.resposta.Resposta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String titulo;

    @Column(unique = true, nullable = false)
    private String mensagem;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @OneToOne
    @JoinColumn(name = "respostas_id")
    private Resposta respostas;

    @Enumerated(EnumType.STRING)
    private EstadoDoTopico estadoDoTopico;

    public Topico(DadosCadastroTopico dados){
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = new Autor(dados.autor());
        this.curso = new Curso(dados.curso());
        this.estadoDoTopico = estadoDoTopico.ABERTO;
    }

    public void atualizar(DadosAtualizacaoTopico dados) {

        if (dados.titulo() != null){
            this.titulo = dados.titulo();
        }

        if (dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }

        if (dados.respostas() != null){
            this.respostas = new Resposta(dados.respostas());
        }
    }
}
