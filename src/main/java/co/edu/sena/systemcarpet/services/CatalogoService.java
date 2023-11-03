package co.edu.sena.systemcarpet.services;

import co.edu.sena.systemcarpet.models.entities.ventas.Catalogo;
import co.edu.sena.systemcarpet.repositories.ICatalogoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CatalogoService {
    private final ICatalogoRepository iCatalogoRepository;

    public CatalogoService(ICatalogoRepository iCatalogoRepository) {
        this.iCatalogoRepository = iCatalogoRepository;
    }

    public ArrayList<Catalogo> getAllCatalogue(){
        return new ArrayList<>(iCatalogoRepository.findAll());
    }
}
