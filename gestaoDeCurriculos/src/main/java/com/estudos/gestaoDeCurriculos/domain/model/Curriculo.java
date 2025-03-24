package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Curriculo {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @NotNull
    private Long id;

}
