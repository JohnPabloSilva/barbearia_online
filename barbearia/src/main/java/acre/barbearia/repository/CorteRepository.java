package acre.barbearia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import acre.barbearia.models.Corte;

@Repository
public interface CorteRepository extends JpaRepository<Corte, Long>{
    
    @Query("""
        SELECT c FROM Corte c
        WHERE (:termoBusca IS NULL OR c.nomeDoCorte LIKE %:termoBusca%)
            """)
    List<Corte> buscaCorte(String termoBusca);

}
