package br.com.projectprofessors.ProjectProfessors.api.alunos.services;

import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoRequest;
import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoResponse;

import java.util.List;

public interface AlunoService {

    List<AlunoResponse> listarAlunosPorProfessorLogado();
    AlunoResponse cadastrarAluno(AlunoRequest alunoRequest, Long professorId);

}