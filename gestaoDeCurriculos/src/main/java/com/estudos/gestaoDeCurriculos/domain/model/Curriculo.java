package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @NotNull
    private Long id;

    @Lob
    private byte[] arquivo; //Armazena o arquivo em formato binário

    private String nomeArquivo;

    private String tipoArquivo; //Ex: application/pdf

    @OneToOne
    @JoinColumn(name = "fk_id_candidato", nullable = false)
    private Candidato candidato;

}
