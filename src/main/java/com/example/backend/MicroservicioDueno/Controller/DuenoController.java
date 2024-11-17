package com.example.backend.MicroservicioDueno.Controller;

import com.example.backend.MicroservicioDueno.DTO.DuenoDTO;
import com.example.backend.MicroservicioDueno.Service.DuenoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dueno")
public class DuenoController {
    private final DuenoService duenoService;

    public DuenoController(DuenoService duenoService) {
        this.duenoService = duenoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DuenoDTO> getUsuario(@PathVariable Long id){
        return ResponseEntity.ok(duenoService.getDuenoById(1L));
    }

}
