package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Estampado;
import co.edu.sena.systemcarpet.repositories.EstampadoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstampadoService implements DaoServices<Estampado, Long> {

    @Autowired
    private EstampadoRepository estampadoRepository;
    @Override
    public List<Estampado> fAll() {
        return this.estampadoRepository.findAll();
    }

    @Override
    public Estampado fById(Long id) {
        return this.estampadoRepository.getById(id);
    }

    @Override
    public int save(Estampado obje) {
        this.estampadoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Estampado obje) {
        this.estampadoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Estampado obje) {
        return 0;
    }
}
