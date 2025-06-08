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
@Table(name = "TB_ESTACAO")
public class Estacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estacao_seq")
    @SequenceGenerator(name = "estacao_seq", sequenceName = "ESTACAO_SEQ", allocationSize = 1)
    @Column(name = "ID_ESTACAO")
    private Long id;

    @NotBlank
    @Column(name = "NM_ESTACAO", nullable = false)
    private String nome;

    @NotBlank
    @Column(name = "CIDADE", nullable = false)
    private String cidade;

    @NotBlank
    @Column(name = "UF", nullable = false)
    private String uf;

    @NotNull
    @Column(name = "LATITUDE", nullable = false)
    private Double latitude;

    @NotNull
    @Column(name = "LONGITUDE", nullable = false)
    private Double longitude;

    @Column(name = "LOCALIZACAO", length = 255)
    private String localizacao;

    public Estacao() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
