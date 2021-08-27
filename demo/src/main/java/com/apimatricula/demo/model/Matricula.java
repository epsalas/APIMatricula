package com.apimatricula.demo.model;

import java.util.Date;
import lombok.*;
import java.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Matricula {

    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String Nombre;
    private Date FechaNacimiento;
    private String Genero;
    private String carrera;

    

}
