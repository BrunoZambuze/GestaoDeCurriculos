package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Experiencia {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @NotNull
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;

    @NotNull
    private OffsetDateTime dataInicio;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Candidato candidato;

}
