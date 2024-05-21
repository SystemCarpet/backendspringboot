package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.EstadoArticulo;
import co.edu.sena.systemcarpet.repositories.EstadoAticuloRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoArticuloService implements DaoServices<EstadoArticulo, Long> {

    @Autowired
    private EstadoAticuloRepository estadoAticuloRepository;
    @Override
    public List<EstadoArticulo> fAll() {
        return this.estadoAticuloRepository.findAll();
    }

    @Override
    public EstadoArticulo fById(Long id) {
        return this.estadoAticuloRepository.getById(id);
    }

    @Override
    public int save(EstadoArticulo obje) {
        this.estadoAticuloRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(EstadoArticulo obje) {
        this.estadoAticuloRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(EstadoArticulo obje) {
        return 0;
    }
}
