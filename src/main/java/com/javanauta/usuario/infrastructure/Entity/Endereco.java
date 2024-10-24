package com.javanauta.usuario.infrastructure.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
@Builder
<<<<<<< HEAD

=======
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "complemento", length = 10)
    private String complemento;
    @Column(name = "cidade", length = 150)
    private String cidade;
    @Column(name = "estado", length = 2)
    private String estado;
    @Column(name = "cep", length = 9)
    private String cep;
<<<<<<< HEAD
    @Column (name = "usuario_id")
    private Long usuario_id;



=======
    @Column(name = "usuario_id")
    private Long usuario_id;


>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
}
