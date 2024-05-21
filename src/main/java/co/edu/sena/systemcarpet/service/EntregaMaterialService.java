package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.EntregaMaterial;
import co.edu.sena.systemcarpet.repositories.EntregaMaterialRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaMaterialService implements DaoServices<EntregaMaterial, Long> {

    @Autowired
    private EntregaMaterialRepository entregaMaterialRepository;
    @Override
    public List<EntregaMaterial> fAll() {
        return this.entregaMaterialRepository.findAll();
    }

    @Override
    public EntregaMaterial fById(Long id) {
        return this.entregaMaterialRepository.getById(id);
    }

    @Override
    public int save(EntregaMaterial obje) {
        this.entregaMaterialRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(EntregaMaterial obje) {
        this.entregaMaterialRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(EntregaMaterial obje) {
        return 0;
    }
}
