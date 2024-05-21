package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.business.ArticuloBusiness;
import co.edu.sena.systemcarpet.dtos.ArticuloDto;
import co.edu.sena.systemcarpet.entities.EntregaMaterial;
import co.edu.sena.systemcarpet.entities.EstadoArticulo;
import co.edu.sena.systemcarpet.entities.OrdenPersonalizada;
import co.edu.sena.systemcarpet.entities.TipoArticulo;
import co.edu.sena.systemcarpet.service.OrdenPersonalizadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/autocarpet/articulo", method = {RequestMethod.PUT,RequestMethod.POST,RequestMethod.GET, RequestMethod.DELETE})
@CrossOrigin(origins = "*")
public class ArticuloController {


    @Autowired
    private ArticuloBusiness articuloBusiness;

    private Map<String, Object> response = new HashMap<>();
    @Autowired
    private OrdenPersonalizadaService ordenPersonalizadaService;



    @GetMapping("/all")
    public ResponseEntity<Map<String,Object>> findAll(){
        List<ArticuloDto> articuloDtoList = this.articuloBusiness.findAllArticulos();
        this.response.put("status", "ok");
        this.response.put("data", articuloDtoList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Map<String,Object>> createArticulo(@RequestBody Map<String,Object> response){
        ArticuloDto articuloDto = new ArticuloDto();
        articuloDto.setNombre(response.get("nombre").toString());
        articuloDto.setCantidad(Integer.parseInt(response.get("cantidad").toString()));
        articuloDto.setCantidad_min(Integer.parseInt(response.get("cantidad_max").toString()));
        articuloDto.setCantidad_max(Integer.parseInt(response.get("cantidad_min").toString()));
        articuloDto.setDimensiones(response.get("dimensiones").toString());
        articuloDto.setDescripcion(response.get("descripcion").toString());
        articuloDto.setPrecio(Double.parseDouble(response.get("precio").toString()));
        articuloDto.setEstado_articulo_id((EstadoArticulo) response.get(articuloDto.getEstado_articulo_id()));
        articuloDto.setTipo_articulo_id((TipoArticulo) response.get(articuloDto.getTipo_articulo_id()));
        articuloDto.setOrdenPersonalizadaList((List<OrdenPersonalizada>) response.get(articuloDto.getOrdenPersonalizadaList()));
        articuloDto.setEntregaMaterialList((List<EntregaMaterial>) response.get(articuloDto.getEntregaMaterialList()));
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
