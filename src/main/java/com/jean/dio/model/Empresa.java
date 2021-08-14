package com.jean.dio.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter //Substitui a escrita padrão dos métodos Getters
@Setter // ''                                    Setters
@AllArgsConstructor //Cria o construtor com todos atributos da classe
@NoArgsConstructor  // ''               sem nenhum atributo
@EqualsAndHashCode  //Métodos @Override de equals e hash
@Builder
@Entity
public class Empresa {
    @Id
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}