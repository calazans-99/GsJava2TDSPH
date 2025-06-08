package br.com.fiap.safeguard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "TB_SENSOR")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sensor_seq")
    @SequenceGenerator(name = "sensor_seq", sequenceName = "SENSOR_SEQ", allocationSize = 1)
    @Column(name = "ID_SENSOR")
    private Long id;

    @NotBlank
    @Column(name = "TIPO", nullable = false)
    private String tipo;

    @NotBlank
    @Column(name = "UNIDADE", nullable = false)
    private String unidade;

    @NotNull
    @Column(name = "VALOR_MINIMO", nullable = false)
    private Double valorMinimo;

    @NotNull
    @Column(name = "VALOR_MAXIMO", nullable = false)
    private Double valorMaximo;

    @Column(name = "DESCRICAO", length = 255)
    private String descricao;

    public Sensor() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
