package br.com.alura.forumhub.domain.autor;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Autor")
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;

    public Autor(DadosCadastroAutor autor) {
        this.nome = autor.nome();
    }
}
