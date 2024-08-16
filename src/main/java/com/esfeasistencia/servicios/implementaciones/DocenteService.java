package com.esfeasistencia.servicios.implementaciones;

import com.esfeasistencia.modelos.Docente;
import com.esfeasistencia.repositorios.IDocenteRepository;
import com.esfeasistencia.servicios.interfaces.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService implements IDocenteService {
    @Autowired
    private IDocenteRepository docenteRepository;

    @Override
    public Page<Docente> buscarTodosPaginados(Pageable pPageable) {
        return docenteRepository.findAll(pPageable);
    }

    @Override
    public List<Docente> obtenerTodos() {
        return docenteRepository.findAll();
    }

    @Override
    public Optional<Docente> buscarPorId(Integer pId) {
        return docenteRepository.findById(pId);
    }

    @Override
    public Docente guardarOEditar(Docente pDocente) {
        return docenteRepository.save(pDocente);
    }

    @Override
    public void eliminarPorId(Integer pId) {
        docenteRepository.deleteById(pId);
    }
}
