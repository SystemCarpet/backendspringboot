package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Color;
import co.edu.sena.systemcarpet.repositories.ColorRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService implements DaoServices<Color, Long> {

    @Autowired
    private ColorRepository colorRepository;
    @Override
    public List<Color> fAll() {
        return this.colorRepository.findAll();
    }

    @Override
    public Color fById(Long id) {
        return this.colorRepository.getById(id);
    }

    @Override
    public int save(Color obje) {
        this.colorRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Color obje) {
        this.colorRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Color obje) {
        return 0;
    }
}
