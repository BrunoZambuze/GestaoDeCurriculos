package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank
    //Criar anotação de validação onde não é permitido nome com números e caractere especial
    private String nomeCompleto;

    @NotNull
    private OffsetDateTime dataNascimento;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String senha;

}
