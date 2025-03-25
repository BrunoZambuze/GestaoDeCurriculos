package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Candidato extends Usuario{

    @NotBlank
    private String areaAtuacao;

    @OneToMany(mappedBy = "candidato", orphanRemoval = true)
    private List<Experiencia> experienciaLista;

    @NotNull
    @OneToOne(mappedBy = "candidato", cascade = CascadeType.ALL, orphanRemoval = true)
    private Curriculo curriculo;

}
