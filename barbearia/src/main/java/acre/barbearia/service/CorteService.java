package acre.barbearia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acre.barbearia.models.Corte;
import acre.barbearia.repository.CorteRepository;

@Service
public class CorteService implements ICrudService<Corte>{

    @Autowired
    private CorteRepository repo;

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Corte> get(String termoBusca) {
        if(!termoBusca.isBlank() && termoBusca != null){
            return repo.buscaCorte(termoBusca);
        }
        else{
            return repo.findAll();
        }
    }

    @Override
    public Corte get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Corte save(Corte objeto) {
        return repo.save(objeto);
    }

    
    
}
