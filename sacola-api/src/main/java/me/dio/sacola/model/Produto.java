package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.ManyToOne;


@AllArgsConstructor //construtor com tds os atributos
@Builder
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private  double valorUnitario;
    @Builder.Default //produto ja esta disponivel
    private Boolean disponivel=true;
    @ManyToOne
    @JsonIgnore
    private Restaurante restaurante;
}
