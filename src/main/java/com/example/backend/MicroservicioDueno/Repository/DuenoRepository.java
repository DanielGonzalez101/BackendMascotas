package com.example.backend.MicroservicioDueno.Repository;

import com.example.backend.MicroservicioDueno.Modelo.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DuenoRepository extends JpaRepository<Dueno, Long> {

}
