package com.example.backend.MicroservicioDueno.Mapper;

import com.example.backend.MicroservicioDueno.DTO.DuenoDTO;
import com.example.backend.MicroservicioDueno.Modelo.Dueno;

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
