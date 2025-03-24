package com.estudos.gestaoDeCurriculos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Candidato extends Usuario{

    @OneToMany(mappedBy = "id")
    private List<Experiencia> experienciaLista;

    @NotNull
    @OneToOne(mappedBy = "id")
    private Curriculo curriculo;

}
