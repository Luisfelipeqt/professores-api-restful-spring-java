package br.com.projectprofessors.ProjectProfessors.api.services;

import br.com.projectprofessors.ProjectProfessors.api.professores.dtos.ProfessorResponse;
import br.com.projectprofessors.ProjectProfessors.api.professores.mappers.ProfessorMapper;
import br.com.projectprofessors.ProjectProfessors.core.exceptions.ModelNotFoundException;
import br.com.projectprofessors.ProjectProfessors.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService{

    private final ProfessorMapper professorMapper;
    private final ProfessorRepository professorRepository;



    @Override
    public List<ProfessorResponse> buscarProfessores(String descricao) {
        return professorRepository.findByDescricaoContaining(descricao)
                .stream()
                .map(professorMapper::toProfessorResponse)
                .toList();
    }

    @Override
    public ProfessorResponse buscarProfessorPorId(Long professorId) {
        return professorRepository.findById(professorId)
                .map(professorMapper::toProfessorResponse)
                .orElseThrow(() -> new ModelNotFoundException("Professor não encontrado"));
    }
}
