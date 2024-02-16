package com.example.Spring5;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lombok
@AllArgsConstructor //lombok
@NoArgsConstructor //lombok

@Table //sql
@Entity //sql

public class Enrollments {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id_enrollments;
    @ManyToOne
    private Student students;
    @ManyToOne
    private Class classes;
}


