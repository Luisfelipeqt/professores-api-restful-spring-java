package br.com.projectprofessors.ProjectProfessors.api.professores.controllers;

import br.com.projectprofessors.ProjectProfessors.api.professores.common.routes.ApiRoutes;
import br.com.projectprofessors.ProjectProfessors.api.professores.dtos.ProfessorResponse;
import br.com.projectprofessors.ProjectProfessors.api.professores.services.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping(ApiRoutes.BUSCAR_PROFESSORES)
    public List<ProfessorResponse> buscarProfessores(@RequestParam(
            name = "q",
            required = false,
            defaultValue = "") String descricao){
        return professorService.buscarProfessores(descricao);
    }

    @GetMapping(ApiRoutes.BUSCAR_PROFESSORES_POR_ID)
    public ProfessorResponse buscarProfessorPorId(@PathVariable Long professorId) {
        return professorService.buscarProfessorPorId(professorId);
    }
}
