package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.MetodoEntrega;
import co.edu.sena.systemcarpet.repositories.MetodoEntregaRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodoEntregaService implements DaoServices<MetodoEntrega, Long> {

    @Autowired
    private MetodoEntregaRepository metodoEntregaRepository;
    @Override
    public List<MetodoEntrega> fAll() {
        return this.metodoEntregaRepository.findAll();
    }

    @Override
    public MetodoEntrega fById(Long id) {
        return this.metodoEntregaRepository.getById(id);
    }

    @Override
    public int save(MetodoEntrega obje) {
        this.metodoEntregaRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(MetodoEntrega obje) {
        this.metodoEntregaRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(MetodoEntrega obje) {
        return 0;
    }
}
