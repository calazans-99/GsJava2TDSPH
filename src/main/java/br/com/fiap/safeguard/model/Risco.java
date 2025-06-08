package br.com.fiap.safeguard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_RISCO")
public class Risco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "risco_seq")
    @SequenceGenerator(name = "risco_seq", sequenceName = "RISCO_SEQ", allocationSize = 1)
    @Column(name = "ID_RISCO")
    private Long id;

    @NotBlank
    @Column(name = "TIPO", nullable = false)
    private String tipo;

    @NotBlank
    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @NotNull
    @Column(name = "VALOR", nullable = false)
    private Double valor;

    @Column(name = "DATA_HORA")
    private LocalDateTime dataHora;

    public Risco() {}

    @PrePersist
    protected void onCreate() {
        this.dataHora = LocalDateTime.now();
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
