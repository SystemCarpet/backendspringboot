package co.edu.sena.systemcarpet.controllers;

import co.edu.sena.systemcarpet.models.entities.ventas.Catalogo;
import co.edu.sena.systemcarpet.services.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
@CrossOrigin(origins = "http://localhost:5173/")
@Controller
@RequestMapping("/api")
public class CatalogoController {
    private final CatalogoService catalogoService;
    @Autowired
    public CatalogoController(CatalogoService catalogoService) {
        this.catalogoService = catalogoService;
    }

    @GetMapping("/catalogos")
    public ResponseEntity<ArrayList<Catalogo>> getAllCatalogues(){
        return new ResponseEntity<>(catalogoService.getAllCatalogue(), HttpStatus.OK);
    }
}
