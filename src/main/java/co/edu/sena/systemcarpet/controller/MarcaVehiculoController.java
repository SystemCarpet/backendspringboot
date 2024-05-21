package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.business.MarcaVehiculoBusiness;
import co.edu.sena.systemcarpet.dtos.MarcaVehiculoDto;
import co.edu.sena.systemcarpet.service.MarcaVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/autocarpet/marcavehiculo", method = {RequestMethod.PUT,RequestMethod.POST,RequestMethod.GET, RequestMethod.DELETE})
@CrossOrigin(origins = "*")
public class MarcaVehiculoController {

    @Autowired
    private MarcaVehiculoBusiness marcaVehiculoBusiness;
    private Map<String, Object> response = new HashMap<>();
    @Autowired
    private MarcaVehiculoService marcaVehiculoService;
    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> findAll() {
        List<MarcaVehiculoDto> marcaVehiculoDtoList = this.marcaVehiculoBusiness.finAllMarcaVehiculos();
        response.put("status", "ok");
        response.put("data", marcaVehiculoDtoList);
        return  ResponseEntity.ok(response);
    }

    @PostMapping("/crear")
    public ResponseEntity<Map<String, Object>> createMarca(@RequestBody Map<String, Object> response){
        MarcaVehiculoDto marcaVehiculoDto = new MarcaVehiculoDto();
        marcaVehiculoDto.setId(Long.parseLong(response.get("id").toString()));
        marcaVehiculoDto.setNombre(response.get("nombre").toString());
        if (this.marcaVehiculoBusiness.crearMarca(marcaVehiculoDto) > 0){
            response.put("status", "ok");
            response.put("message", "Marca ha sido creada");
        }else{
            response.put("status", "ok");
            response.put("message", "Error al crear la marca");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("/eliminar")
    public ResponseEntity<Map<String, Object>> deleteMarca(@RequestBody Map<String, Object> response){
     MarcaVehiculoDto marcaVehiculoDto = new MarcaVehiculoDto();
     marcaVehiculoDto.setId(Long.parseLong(response.get("id").toString()));
     this.marcaVehiculoBusiness.eliminarMarca(marcaVehiculoDto);
     response.put("status", "ok");
     response.put("message", "Marca ha sido eliminada");
     return ResponseEntity.ok(response);
    }

    @PostMapping("/actualizar")
    public ResponseEntity<Map<String, Object>> actualizarMarca(@RequestBody Map<String, Object> response){
        MarcaVehiculoDto marcaVehiculoDto = new MarcaVehiculoDto();
        marcaVehiculoDto.setId(Long.parseLong(response.get("id").toString()));
        marcaVehiculoDto.setNombre(response.get("nombre").toString());
        this.marcaVehiculoBusiness.updateMarca(marcaVehiculoDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/buscar")
    public ResponseEntity<Map<String, Object>> buscarMarca(@RequestBody Map<String, Object> response){
        MarcaVehiculoDto marcaVehiculoDto = new MarcaVehiculoDto();
        marcaVehiculoDto.setId(Long.parseLong(response.get("id").toString()));
        marcaVehiculoDto.setId(this.marcaVehiculoBusiness.buscarMarcaVehiculo(marcaVehiculoDto.getId()).getId());
        marcaVehiculoDto.setNombre(this.marcaVehiculoBusiness.buscarMarcaVehiculo(marcaVehiculoDto.getId()).getNombre());
        response.put("status", "ok");
        response.put("message", "Marca ha sido encontrada");
        response.put("Datos", marcaVehiculoDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
