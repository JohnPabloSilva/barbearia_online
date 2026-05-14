package acre.barbearia.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @OneToOne
    private Usuario usuarioDoAgendamento;

    @OneToMany
    private List<Barbeiro> barbeirosDoAgendamento;

    @OneToMany
    private List<Corte> cortesDoAgendamento;

    private Double precoTotal;

    private LocalDateTime horarioDeEntrada;

    private LocalDateTime horarioDeSaida;

    @Column(length = 4000)
    private String observacao;

    @Enumerated(EnumType.STRING)
    private EnumSituacao situacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuarioDoAgendamento() {
        return usuarioDoAgendamento;
    }

    public void setUsuarioDoAgendamento(Usuario usuario) {
        this.usuarioDoAgendamento = usuario;
    }

    public List<Barbeiro> getBarbeirosDoAgendamento() {
        return barbeirosDoAgendamento;
    }

    public void setBarbeirosDoAgendamento(List<Barbeiro> barbeirosDoAgendamento) {
        this.barbeirosDoAgendamento = barbeirosDoAgendamento;
    }

    public List<Corte> getCortesDoAgendamento() {
        return cortesDoAgendamento;
    }

    public void setCortesDoAgendamento(List<Corte> cortesDoAgendamento) {
        this.cortesDoAgendamento = cortesDoAgendamento;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public LocalDateTime getHorarioDeEntrada() {
        return horarioDeEntrada;
    }

    public void setHorarioDeEntrada(LocalDateTime horarioDeEntrada) {
        this.horarioDeEntrada = horarioDeEntrada;
    }

    public LocalDateTime getHorarioDeSaida() {
        return horarioDeSaida;
    }

    public void setHorarioDeSaida(LocalDateTime horarioDeSaida) {
        this.horarioDeSaida = horarioDeSaida;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public EnumSituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(EnumSituacao situacao) {
        this.situacao = situacao;
    }

    

}
