package br.com.projectprofessors.ProjectProfessors.api.alunos.mappers;

import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoRequest;
import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoResponse;
import br.com.projectprofessors.ProjectProfessors.core.entities.Aluno;

public interface AlunoMapper {

    Aluno toAluno(AlunoRequest alunoRequest);
    AlunoResponse toAlunoResponse(Aluno aluno);

}