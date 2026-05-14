package acre.barbearia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import acre.barbearia.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    @Query("""
        SELECT u FROM Usuario u
        WHERE (:termoBusca IS NULL OR u.nome LIKE %:termoBusca%)
        """)
    List<Usuario> buscaUsuario(String termoBusca);
    
}
