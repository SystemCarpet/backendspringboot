package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Barrio;
import co.edu.sena.systemcarpet.repositories.BarrioRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarrioService implements DaoServices<Barrio, Long> {

    @Autowired
    private BarrioRepository barrioRepository;
    @Override
    public List<Barrio> fAll() {
        return this.barrioRepository.findAll();
    }

    @Override
    public Barrio fById(Long id) {
        return this.barrioRepository.getById(id);
    }

    @Override
    public int save(Barrio obje) {
        this.barrioRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Barrio obje) {
        this.barrioRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Barrio obje) {
        return 0;
    }
}
