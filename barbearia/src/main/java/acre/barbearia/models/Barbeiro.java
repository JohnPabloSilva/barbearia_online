package acre.barbearia.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Barbeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String nomeBarbeiro;

    @OneToMany(mappedBy = "barbeiro", cascade = CascadeType.ALL)
    private List<Corte> cortesDoBarbeiro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeBarbeiro() {
        return nomeBarbeiro;
    }

    public void setNomeBarbeiro(String nomeBarbeiro) {
        this.nomeBarbeiro = nomeBarbeiro;
    }

    public List<Corte> getCortesDoBarbeiro() {
        return cortesDoBarbeiro;
    }

    public void setCortesDoBarbeiro(List<Corte> cortesDoBarbeiro) {
        this.cortesDoBarbeiro = cortesDoBarbeiro;
    }

    
    
}
