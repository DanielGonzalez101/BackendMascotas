package com.example.backend.MicroservicioDueño.Service;

import com.example.backend.MicroservicioDueño.Exception.DuenoNotFoundException;
import com.example.backend.MicroservicioDueño.DTO.DuenoDTO;
import com.example.backend.MicroservicioDueño.Mapper.DuenoMapper;
import com.example.backend.MicroservicioDueño.Modelo.Dueno;
import com.example.backend.MicroservicioDueño.Repository.DuenoRepository;

public class DuenoService {
    private final DuenoRepository duenoRepository;

    public DuenoService(DuenoRepository duenoRepository) {
        this.duenoRepository = duenoRepository;
    }


    public DuenoDTO getDuenoById(Long id){
        Dueno dueno = duenoRepository.findById(id).orElseThrow(() -> new DuenoNotFoundException("Dueno no encontrado"));
        return DuenoMapper.getDTO();
    }
}
