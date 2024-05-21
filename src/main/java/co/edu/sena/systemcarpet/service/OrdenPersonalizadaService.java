package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.OrdenPersonalizada;
import co.edu.sena.systemcarpet.repositories.OrdenPersonalizadaRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenPersonalizadaService implements DaoServices<OrdenPersonalizada, Long> {

    @Autowired
    private OrdenPersonalizadaRepository ordenPersonalizadaRepository;
    @Override
    public List<OrdenPersonalizada> fAll() {
        return this.ordenPersonalizadaRepository.findAll();
    }

    @Override
    public OrdenPersonalizada fById(Long id) {
        return this.ordenPersonalizadaRepository.getById(id);
    }

    @Override
    public int save(OrdenPersonalizada obje) {
        this.ordenPersonalizadaRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(OrdenPersonalizada obje) {
        this.ordenPersonalizadaRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(OrdenPersonalizada obje) {
        return 0;
    }
}
