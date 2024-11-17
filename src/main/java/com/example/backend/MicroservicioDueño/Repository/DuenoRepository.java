package com.example.backend.MicroservicioDueño.Repository;

import com.example.backend.MicroservicioDueño.Modelo.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DuenoRepository extends JpaRepository<Dueno, Long> {

}
