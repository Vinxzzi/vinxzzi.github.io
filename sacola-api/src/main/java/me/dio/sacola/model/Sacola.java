package me.dio.sacola.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.sacola.enumeration.FormaPagamento;
import javax.persistence.*;
import java.util.List;

@AllArgsConstructor //construtor com tds os atributos
@Builder
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Sacola {
    @Id//CADA UMA DESSAS ESTA EM UM PACOTE INSTALADO
    @GeneratedValue(strategy = GenerationType.AUTO)//Gerador de Id, salva automatico
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)// um cliente pode ter varias sacolas
    @JsonIgnore //ignorar erros com o contato de front com a API
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;


}
