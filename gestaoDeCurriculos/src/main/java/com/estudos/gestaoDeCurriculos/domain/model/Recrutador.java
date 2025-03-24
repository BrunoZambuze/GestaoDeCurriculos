package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Recrutador extends Usuario{

    @NotBlank
    private String nomeEmpresa;

}
