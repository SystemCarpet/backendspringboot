package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Pedido;
import co.edu.sena.systemcarpet.repositories.PedidoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements DaoServices<Pedido, Long> {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Override
    public List<Pedido> fAll() {
        return this.pedidoRepository.findAll();
    }

    @Override
    public Pedido fById(Long id) {
        return this.pedidoRepository.getById(id);
    }

    @Override
    public int save(Pedido obje) {
        this.pedidoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Pedido obje) {
        this.pedidoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Pedido obje) {
        return 0;
    }
}
