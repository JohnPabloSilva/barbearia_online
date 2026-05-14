package acre.barbearia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acre.barbearia.models.Agendamento;
import acre.barbearia.repository.AgendamentoRepository;

@Service
public class AgendamentoService implements ICrudService<Agendamento>{

    @Autowired
    private AgendamentoRepository repo;

    @Override
    public Agendamento get(Long id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Agendamento> get(String termoBusca){
        if (!termoBusca.isBlank() && termoBusca != null){
            return repo.buscaAgendamentos(termoBusca);
        }
        else{
            return repo.findAll();
        }
    }

    @Override
    public void delete(Long id){
        repo.deleteById(id);
    }

    @Override
    public Agendamento save(Agendamento objeto){
        //Precisa de uma lógica muito boa aqui
        Agendamento objetosalvo = repo.save(objeto);
        return objetosalvo;
    }
    
}
