package acre.barbearia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import acre.barbearia.models.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

    @Query("""
        SELECT a FROM Agendamento a
        LEFT JOIN Usuario u ON u = a.usuario
        WHERE (:termoBusca IS NULL OR u.nome LIKE %:termoBusca%)
        UNION
        SELECT a FROM Agendamento a
        LEFT JOIN Barbeiro b ON b = a.barbeiro
        WHERE (:termoBusca IS NULL OR b.nomeBarbeiro LIKE %:termoBusca%)
        """)
    List<Agendamento> buscaAgendamentos(String termoBusca);
}
