package br.com.projectprofessors.ProjectProfessors.core.exceptions;

public class ModelNotFoundException extends RuntimeException{

    public ModelNotFoundException(String message){
        super(message);
    }
}
