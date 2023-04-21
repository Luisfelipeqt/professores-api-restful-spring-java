package br.com.projectprofessors.ProjectProfessors.api.alunos.controller;

import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoRequest;
import br.com.projectprofessors.ProjectProfessors.api.alunos.dtos.AlunoResponse;
import br.com.projectprofessors.ProjectProfessors.api.alunos.routes.ApiRoutes;
import br.com.projectprofessors.ProjectProfessors.api.alunos.services.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AlunoRestController {

    private final AlunoService alunoService;


    @PostMapping(ApiRoutes.CADASTRAR_ALUNO)
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoResponse cadastrarAluno(@RequestBody @Valid AlunoRequest alunoRequest,
                                        @PathVariable Long professorId) {
        return alunoService.cadastrarAluno(alunoRequest, professorId);
    }
}
