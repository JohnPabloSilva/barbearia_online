package acre.barbearia.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Corte implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String nomeDoCorte;

    @Column(nullable = false, updatable = false)
    private LocalDateTime tempoDeCorte;

    @Column(nullable = false, updatable = false)
    private Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoCorte() {
        return nomeDoCorte;
    }

    public void setNomeDoCorte(String nomeDoCorte) {
        this.nomeDoCorte = nomeDoCorte;
    }

    public LocalDateTime getTempoDeCorte() {
        return tempoDeCorte;
    }

    public void setTempoDeCorte(LocalDateTime tempoDeCorte) {
        this.tempoDeCorte = tempoDeCorte;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
}
