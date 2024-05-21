package co.edu.sena.systemcarpet.business;

import co.edu.sena.systemcarpet.dtos.MarcaVehiculoDto;
import co.edu.sena.systemcarpet.entities.MarcaVehiculo;
import co.edu.sena.systemcarpet.service.MarcaVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MarcaVehiculoBusiness {

    @Autowired
    private MarcaVehiculoService marcaVehiculoService;
    private List<MarcaVehiculoDto> marcaVehiculoDtoList;
    public List<MarcaVehiculoDto> finAllMarcaVehiculos(){
        this.marcaVehiculoDtoList = new ArrayList<>();
        List<MarcaVehiculo> marcaVehiculosList = this.marcaVehiculoService.fAll();
        marcaVehiculosList.forEach(marcaVehiculos -> {
            MarcaVehiculoDto marcaVehiculoDto = new MarcaVehiculoDto();
            marcaVehiculoDto.setId(marcaVehiculos.getId());
            marcaVehiculoDto.setNombre(marcaVehiculos.getNombre());

            this.marcaVehiculoDtoList.add(marcaVehiculoDto);
        });
        return this.marcaVehiculoDtoList;
    }

    public int crearMarca(MarcaVehiculoDto object){
        MarcaVehiculo marcaVehiculos = new MarcaVehiculo();
        marcaVehiculos.setId(object.getId());
        marcaVehiculos.setNombre(object.getNombre());
        return this.marcaVehiculoService.save(marcaVehiculos);
    }

    public int eliminarMarca(MarcaVehiculoDto object){
        MarcaVehiculo marcaVehiculos = new MarcaVehiculo();
        marcaVehiculos.setId(object.getId());
        marcaVehiculos.setNombre(marcaVehiculos.getNombre());
        return this.marcaVehiculoService.delete(marcaVehiculos);
    }

    public MarcaVehiculo buscarMarcaVehiculo(Long id) {
        return this.marcaVehiculoService.fById(id);
    }

    public int updateMarca(MarcaVehiculoDto object) {
        MarcaVehiculo marcaVehiculos = new MarcaVehiculo();
        marcaVehiculos.setId(this.buscarMarcaVehiculo(object.getId()).getId());
        marcaVehiculos.setNombre(object.getNombre());
        return this.marcaVehiculoService.update(marcaVehiculos);
    }


}
