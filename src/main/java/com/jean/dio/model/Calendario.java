package com.jean.dio.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter //Substitui a escrita padrão dos métodos Getters
@Setter // ''                                    Setters
@AllArgsConstructor //Cria o construtor com todos atributos da classe
@NoArgsConstructor  // ''               sem nenhum atributo
@EqualsAndHashCode  //Métodos @Override de equals e hash
@Builder
@Entity
public class Calendario {
    @Id
    private long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}