package com.eventosapp.repository;

import com.eventosapp.models.Evento;
import org.springframework.stereotype.Repository;
@Repository
public interface EventoRepository {

    Evento findByCodigo(String codigo);

}
