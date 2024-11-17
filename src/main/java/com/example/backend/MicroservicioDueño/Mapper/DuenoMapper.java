package com.example.backend.MicroservicioDueño.Mapper;

import com.example.backend.MicroservicioDueño.DTO.DuenoDTO;
import com.example.backend.MicroservicioDueño.Modelo.Dueno;

public class DuenoMapper {

    public static DuenoDTO getDTO() {
        return new DuenoDTO("Daniel", "Gonzalez");
    }

    public static Dueno getDueno() {
        return new Dueno(
                "Daniel",
                "Gonzalez",
                "23124",
                1L
        );
    }
}
