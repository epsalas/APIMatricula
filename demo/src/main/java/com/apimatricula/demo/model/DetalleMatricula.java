package com.apimatricula.demo.model;
import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleMatricula {
    
    private Integer int;
    private int IDMatricula;
    private String Curso;
    private Date FechaMatricula;

    private Matricula Matricula;

}
