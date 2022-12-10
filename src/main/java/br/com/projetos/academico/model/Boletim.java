package br.com.projetos.academico.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Boletim {

    private Double notaPrimeiraUnidade;
    private Double notaSegundaUnidade;
    private Double notaTerceiraUnidade;
    private Double notaQuartaUnidade;
}
