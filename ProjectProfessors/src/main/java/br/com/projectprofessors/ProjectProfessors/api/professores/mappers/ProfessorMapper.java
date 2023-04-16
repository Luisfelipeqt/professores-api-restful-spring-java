package br.com.projectprofessors.ProjectProfessors.api.professores.mappers;

import br.com.projectprofessors.ProjectProfessors.api.professores.dtos.ProfessorResponse;
import br.com.projectprofessors.ProjectProfessors.core.entities.Professor;

public interface ProfessorMapper {

    ProfessorResponse toProfessorResponse(Professor professor);
}
