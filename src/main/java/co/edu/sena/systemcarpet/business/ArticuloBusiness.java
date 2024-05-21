package co.edu.sena.systemcarpet.business;

import co.edu.sena.systemcarpet.dtos.ArticuloDto;
import co.edu.sena.systemcarpet.entities.Articulo;
import co.edu.sena.systemcarpet.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticuloBusiness {

    @Autowired
    private ArticuloService articuloService;
    private List<ArticuloDto> articuloDtoList;
    public List<ArticuloDto> findAllArticulos(){
        this.articuloDtoList = new ArrayList<>();
        List<Articulo> articuloList = this.articuloService.fAll();
        articuloList.forEach(articulo -> {
            ArticuloDto articuloDto = new ArticuloDto();
            articuloDto.setId(articulo.getId());
            articuloDto.setNombre(articulo.getNombre());
            articuloDto.setCantidad(articulo.getCantidad());
            articuloDto.setCantidad_min(articulo.getCantidad_min());
            articuloDto.setCantidad_max(articulo.getCantidad_max());
            articuloDto.setDimensiones(articulo.getDimensiones());
            articuloDto.setDescripcion(articulo.getDescripcion());
            articuloDto.setPrecio(articulo.getPrecio());
            articuloDto.setEstado_articulo_id(articulo.getEstado_articulo_id());
            articuloDto.setTipo_articulo_id(articulo.getTipo_articulo_id());
            articuloDto.setOrdenPersonalizadaList(articulo.getOrdenPersonalizadaList());
            articuloDto.setEntregaMaterialList(articulo.getEntregaMaterialList());

            this.articuloDtoList.add(articuloDto);
        });
        return this.articuloDtoList;
    }

    public int crearAtriculo(ArticuloDto object){
        Articulo articulo = new Articulo();
        articulo.setId(object.getId());
        articulo.setNombre(object.getNombre());
        articulo.setCantidad(object.getCantidad());
        articulo.setCantidad_min(object.getCantidad_min());
        articulo.setCantidad_max(object.getCantidad_max());
        articulo.setDimensiones(object.getDimensiones());
        articulo.setDescripcion(object.getDescripcion());
        articulo.setPrecio(object.getPrecio());
        articulo.setEstado_articulo_id(object.getEstado_articulo_id());
        articulo.setTipo_articulo_id(object.getTipo_articulo_id());
        articulo.setOrdenPersonalizadaList(object.getOrdenPersonalizadaList());
        articulo.setEntregaMaterialList(object.getEntregaMaterialList());
        return this.articuloService.save(articulo);
    }

    public int eliminarArticulo(Articulo object){
        Articulo articulo = new Articulo();
        articulo.setId(object.getId());
        articulo.setNombre(articulo.getNombre());
        articulo.setCantidad(object.getCantidad());
        articulo.setCantidad_min(object.getCantidad_min());
        articulo.setCantidad_max(object.getCantidad_max());
        articulo.setDimensiones(object.getDimensiones());
        articulo.setDescripcion(object.getDescripcion());
        articulo.setPrecio(object.getPrecio());
        articulo.setEstado_articulo_id(object.getEstado_articulo_id());
        articulo.setTipo_articulo_id(object.getTipo_articulo_id());
        articulo.setOrdenPersonalizadaList(object.getOrdenPersonalizadaList());
        articulo.setEntregaMaterialList(object.getEntregaMaterialList());
        return this.articuloService.delete(articulo);

    }

    public Articulo buscarArticulo(Long id){
        return this.articuloService.fById(id);
    }

    
}



