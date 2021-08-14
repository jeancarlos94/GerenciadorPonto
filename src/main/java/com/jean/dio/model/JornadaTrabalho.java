package com.jean.dio.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //Substitui a escrita padrão dos métodos Getters
@Setter // ''                                    Setters
@AllArgsConstructor //Cria o construtor com todos atributos da classe
@NoArgsConstructor  // ''               sem nenhum atributo
@EqualsAndHashCode  //Métodos @Override de equals e hash
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue()
    private long id;
    private String descricao;
}