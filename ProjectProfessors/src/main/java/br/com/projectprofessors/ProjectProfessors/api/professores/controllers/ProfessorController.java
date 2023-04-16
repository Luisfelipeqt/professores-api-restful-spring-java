package br.com.projectprofessors.ProjectProfessors.api.professores.controllers;

import br.com.projectprofessors.ProjectProfessors.api.professores.dtos.ProfessorResponse;
import br.com.projectprofessors.ProjectProfessors.api.professores.services.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping(value = "/api/professores")
    public List<ProfessorResponse> buscarProfessores(@RequestParam(
            name = "q",
            required = false,
            defaultValue = "") String descricao){
        return professorService.buscarProfessores(descricao);
    }
}
