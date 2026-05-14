package acre.barbearia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acre.barbearia.models.Usuario;
import acre.barbearia.repository.UsuarioRepository;

@Service
public class UsuarioService implements ICrudService<Usuario>{

    @Autowired
    private UsuarioRepository repo;

    @Override
    public void delete(Long id) {
        repo.deleteById(id); 
    }

    @Override
    public List<Usuario> get(String termoBusca) {
        if(!termoBusca.isBlank() && termoBusca != null){
            return repo.buscaUsuario(termoBusca);
        }
        else{
            return repo.findAll();
        }
    }

    @Override
    public Usuario get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario objeto) {
        return repo.save(objeto);
    }

    
    
}
