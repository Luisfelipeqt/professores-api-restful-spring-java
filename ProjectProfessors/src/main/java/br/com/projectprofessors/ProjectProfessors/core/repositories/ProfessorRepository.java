package br.com.projectprofessors.ProjectProfessors.core.repositories;

import br.com.projectprofessors.ProjectProfessors.core.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    List<Professor> findByDescricaoContaining(String descricao);
}
