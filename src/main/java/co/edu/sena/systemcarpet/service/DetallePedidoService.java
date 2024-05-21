package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.DetallePedido;
import co.edu.sena.systemcarpet.repositories.DetallePedidoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService implements DaoServices<DetallePedido, Long> {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;
    @Override
    public List<DetallePedido> fAll() {
        return this.detallePedidoRepository.findAll();
    }

    @Override
    public DetallePedido fById(Long id) {
        return this.detallePedidoRepository.getById(id);
    }

    @Override
    public int save(DetallePedido obje) {
        this.detallePedidoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(DetallePedido obje) {
        this.detallePedidoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(DetallePedido obje) {
        return 0;
    }
}
