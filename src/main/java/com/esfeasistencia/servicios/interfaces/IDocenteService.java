package com.esfeasistencia.servicios.interfaces;

import com.esfeasistencia.modelos.Docente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteService {

    Page<Docente> buscarTodosPaginados(Pageable pPageable);

    List<Docente> obtenerTodos();

    Optional<Docente> buscarPorId(Integer pId);

    Docente guardarOEditar(Docente pGrupo);

    void eliminarPorId(Integer pId);
}
