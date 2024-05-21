package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.MetodoPago;
import co.edu.sena.systemcarpet.repositories.MetodoPagoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodoPagoService implements DaoServices<MetodoPago, Long> {

    @Autowired
    private MetodoPagoRepository metodoPagoRepository;
    @Override
    public List<MetodoPago> fAll() {
        return this.metodoPagoRepository.findAll();
    }

    @Override
    public MetodoPago fById(Long id) {
        return this.metodoPagoRepository.getById(id);
    }

    @Override
    public int save(MetodoPago obje) {
        this.metodoPagoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(MetodoPago obje) {
        this.metodoPagoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(MetodoPago obje) {
        return 0;
    }
}
