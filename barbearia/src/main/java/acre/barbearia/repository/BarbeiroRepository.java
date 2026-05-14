package acre.barbearia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import acre.barbearia.models.Barbeiro;

@Repository
public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long>{

    @Query("""
            SELECT b from Barbeiro b
            WHERE (:termoBusca IS NULL OR b.nomeBarbeiro LIKE %:termoBusca%)
            """)
    List<Barbeiro> buscaBarbeiros(String termoBusca);
    
}
