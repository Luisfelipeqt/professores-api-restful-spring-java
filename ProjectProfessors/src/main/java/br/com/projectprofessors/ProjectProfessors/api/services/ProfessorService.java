package br.com.projectprofessors.ProjectProfessors.api.services;

import br.com.projectprofessors.ProjectProfessors.api.professores.dtos.ProfessorResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService {

    List<ProfessorResponse> buscarProfessores(String descricao);

    ProfessorResponse buscarProfessorPorId(Long professorId);


}
