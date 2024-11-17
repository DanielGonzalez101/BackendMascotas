package com.example.backend.MicroservicioDueno.DuenoDAO;

import com.example.backend.MicroservicioDueno.Modelo.Dueno;
import com.example.backend.MicroservicioDueno.Repository.DuenoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DuenoDAO {

    private final DuenoRepository duenoRepository;

    public DuenoDAO(DuenoRepository duenoRepository) {
        this.duenoRepository = duenoRepository;
    }

    // Guardar
    public Dueno guardar(Dueno dueno) {
        return duenoRepository.save(dueno);
    }

    // Buscar por ID
    public Optional<Dueno> buscarPorId(Long id) {
        return duenoRepository.findById(id);
    }

    // Buscar todos los usuarios
    public List<Dueno> buscarTodos() {
        return duenoRepository.findAll();
    }

    // Eliminar por ID
    public void eliminarPorId(Long id) {
        duenoRepository.deleteById(id);
    }

}
