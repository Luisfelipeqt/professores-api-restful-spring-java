package br.com.projectprofessors.ProjectProfessors.core.repositories;

import br.com.projectprofessors.ProjectProfessors.core.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
