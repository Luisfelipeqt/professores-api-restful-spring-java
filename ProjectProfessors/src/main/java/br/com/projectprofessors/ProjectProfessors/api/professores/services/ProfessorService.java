package br.com.projectprofessors.ProjectProfessors.api.professores.services;

import br.com.projectprofessors.ProjectProfessors.api.professores.dtos.ProfessorResponse;
import br.com.projectprofessors.ProjectProfessors.core.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService {

    List<ProfessorResponse> buscarProfessores(String descricao);

    ProfessorResponse buscarProfessorPorId(Long professorId);


}
