package com.javanauta.usuario.infrastructure.Entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefone")
@Builder
<<<<<<< HEAD

=======
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero", length = 10)
    private String numero;
    @Column(name = "ddd", length = 3)
    private String ddd;
<<<<<<< HEAD
    @Column (name = "usuario_id")
=======
    @Column(name = "usuario_id")
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
    private Long usuario_id;


}
