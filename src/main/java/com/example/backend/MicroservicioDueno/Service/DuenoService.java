package com.example.backend.MicroservicioDueno.Service;

import com.example.backend.MicroservicioDueno.DuenoDAO.DuenoDAO;
import com.example.backend.MicroservicioDueno.Exception.DuenoNotFoundException;
import com.example.backend.MicroservicioDueno.DTO.DuenoDTO;
import com.example.backend.MicroservicioDueno.Mapper.DuenoMapper;
import com.example.backend.MicroservicioDueno.Modelo.Dueno;
import com.example.backend.MicroservicioDueno.Repository.DuenoRepository;

public class DuenoService {

    private final DuenoDAO duenoDAO;

    public DuenoService(DuenoDAO duenoDAO) {
        this.duenoDAO = duenoDAO;
    }

    public DuenoDTO getDuenoById(Long id){
        Dueno dueno = duenoDAO.buscarPorId(id)
                .orElseThrow(() -> new DuenoNotFoundException("Dueno no encontrado"));
        return DuenoMapper.getDTO();
    }
}
