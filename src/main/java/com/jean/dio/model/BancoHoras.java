package com.jean.dio.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {
    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}