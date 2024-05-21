package co.edu.sena.systemcarpet.service.daoServices;

import co.edu.sena.systemcarpet.dtos.MarcaVehiculoDto;

import java.util.List;

public interface DaoServices<T, ID> {

    public List<T> fAll();
    public T fById(Long id);
    public int save(T obje);
    public int delete(T obje);
    public int update(T obje);
}
