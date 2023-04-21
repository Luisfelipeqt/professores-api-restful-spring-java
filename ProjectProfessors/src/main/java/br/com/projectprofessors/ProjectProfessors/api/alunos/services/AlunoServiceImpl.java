package br.com.projectprofessors.ProjectProfessors.api.alunos.services;

import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoRequest;
import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoResponse;
import br.com.projectprofessors.ProjectProfessors.api.alunos.mappers.AlunoMapper;
import br.com.projectprofessors.ProjectProfessors.core.exceptions.ProfessorNotFoundException;
import br.com.projectprofessors.ProjectProfessors.core.repositories.AlunoRepository;
import br.com.projectprofessors.ProjectProfessors.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    private final AlunoMapper alunoMapper;
    private final AlunoRepository alunoRepository;
    private final ProfessorRepository professorRepository;

    @Override
    public List<AlunoResponse> listarAlunosPorProfessorLogado() {
        return null;
    }

    @Override
    public AlunoResponse cadastrarAluno(AlunoRequest alunoRequest, Long professorId) {
        var professor = professorRepository.findById(professorId)
                .orElseThrow(ProfessorNotFoundException::new);
        var alunoParaCadastrar = alunoMapper.toAluno(alunoRequest);
        alunoParaCadastrar.setProfessor(professor);
        var alunoCadastrado = alunoRepository.save(alunoParaCadastrar);
        return alunoMapper.toAlunoResponse(alunoCadastrado);
    }

}