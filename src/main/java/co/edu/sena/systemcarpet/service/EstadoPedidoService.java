package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.EstadoPedido;
import co.edu.sena.systemcarpet.repositories.EstadoPedidoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoPedidoService implements DaoServices<EstadoPedido, Long> {

    @Autowired
    private EstadoPedidoRepository estadoPedidoRepository;
    @Override
    public List<EstadoPedido> fAll() {
        return this.estadoPedidoRepository.findAll();
    }

    @Override
    public EstadoPedido fById(Long id) {
        return this.estadoPedidoRepository.getById(id);
    }

    @Override
    public int save(EstadoPedido obje) {
        this.estadoPedidoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(EstadoPedido obje) {
        this.estadoPedidoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(EstadoPedido obje) {
        return 0;
    }
}
