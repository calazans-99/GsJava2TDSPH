package br.com.fiap.safeguard.dto;

import java.time.LocalDateTime;

public class LeituraDTO {

    private Long id;
    private LocalDateTime dataHora;
    private Double valor;

    public LeituraDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
