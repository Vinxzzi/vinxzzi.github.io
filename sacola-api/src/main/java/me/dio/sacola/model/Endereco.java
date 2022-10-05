package me.dio.sacola.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;


@AllArgsConstructor //construtor com tds os atributos
@Builder
@NoArgsConstructor//construtor sem atributos
@Data //gets e sets

@Embeddable

public class Endereco {
    private String cep;
    private String complemento;
}
