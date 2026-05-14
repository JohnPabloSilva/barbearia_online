package acre.barbearia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import acre.barbearia.models.Barbeiro;
import acre.barbearia.repository.BarbeiroRepository;

@Service
public class BarbeiroService implements ICrudService<Barbeiro>{

    @Autowired
    private BarbeiroRepository repo;

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Barbeiro> get(String termoBusca) {
        if (!termoBusca.isBlank() && termoBusca != null){
            return repo.buscaBarbeiros(termoBusca);
        }
        else
        {
            return repo.findAll();
        }
    }

    @Override
    public Barbeiro get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Barbeiro save(Barbeiro objeto) {
        return repo.save(objeto);
    }

    
    
}
