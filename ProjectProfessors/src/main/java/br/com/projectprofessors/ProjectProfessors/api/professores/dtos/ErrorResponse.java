package br.com.projectprofessors.ProjectProfessors.api.professores.dtos;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class ErrorResponse {
    private int status;
    private String message;
    private String error;
    private String cause;
    private LocalDateTime timestamp;
}


