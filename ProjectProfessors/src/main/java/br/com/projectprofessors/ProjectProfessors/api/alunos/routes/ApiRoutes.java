package br.com.projectprofessors.ProjectProfessors.api.alunos.routes;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiRoutes {

    public static final String API = "/api";
    public static final String PROFESSORES = "/professores";
    public static final String ALUNOS = "/alunos";
    public static final String VERSAO = "/v1";
    public static final String BUSCAR_PROFESSORES = API + PROFESSORES + VERSAO;
    public static final String BUSCAR_PROFESSORES_POR_ID = API + PROFESSORES + VERSAO + "/{professorId}";

    public static final String CADASTRAR_ALUNO = API + PROFESSORES + "/{professorId}" + ALUNOS + VERSAO;

}
