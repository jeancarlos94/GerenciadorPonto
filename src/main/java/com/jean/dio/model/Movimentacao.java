package com.jean.dio.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //Substitui a escrita padrão dos métodos Getters
@Setter // ''                                    Setters
@AllArgsConstructor //Cria o construtor com todos atributos da classe
@NoArgsConstructor  // ''               sem nenhum atributo
@EqualsAndHashCode  //Métodos @Override de equals e hash
@Builder
@Entity
public class Movimentacao {
    @AllArgsConstructor //Cria o construtor com todos atributos da classe
    @NoArgsConstructor  // ''               sem nenhum atributo
    @EqualsAndHashCode  //Métodos @Override de equals e hash
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private long idMovimento;
        private long idUsuario;
    }
    //@Id
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
