package co.edu.sena.systemcarpet.business;

import co.edu.sena.systemcarpet.dtos.LocalidadDto;
import co.edu.sena.systemcarpet.entities.Localidad;
import co.edu.sena.systemcarpet.service.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocalidadBusiness {

    @Autowired
    private LocalidadService localidadService;
    private List<LocalidadDto> localidadDtoList;
    public List<LocalidadDto> findAllLocalidad() {
        this.localidadDtoList = new ArrayList<>();
        List<Localidad> localidadesList = this.localidadService.fAll();
        localidadesList.forEach(localidad -> {
            LocalidadDto localidadDto = new LocalidadDto();
            localidadDto.setId(localidad.getId());
            localidadDto.setNombre(localidad.getNombre());
            this.localidadDtoList.add(localidadDto);
        });
        return this.localidadDtoList;
    }

    public int crearLocalidad(LocalidadDto object) {
     Localidad localidades = new Localidad();
     localidades.setId(object.getId());
     localidades.setNombre(object.getNombre());
     return this.localidadService.save(localidades);
    }

    public int eliminarLocalidad(LocalidadDto object) {
        Localidad localidades = new Localidad();
        localidades.setId(object.getId());
        localidades.setNombre(object.getNombre());
        return this.localidadService.delete(localidades);
    }

    public Localidad buscarLocalidad(Long id) {
        return this.localidadService.fById(id);
    }
}
