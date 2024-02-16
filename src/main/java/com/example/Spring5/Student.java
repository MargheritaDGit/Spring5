package com.example.Spring5;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //Lombok
@AllArgsConstructor //lombok
@NoArgsConstructor //lombok

@Table //sql
@Entity //sql

public class Student {
  @Id
  @GeneratedValue (strategy  = GenerationType.IDENTITY)
  private Long id_student;
  @Column (nullable = false)
  private String lastName;
  @Column (nullable = false, unique = true) //un valore non può null ed è un valore unico
  private String email;
  @OneToMany(mappedBy = "students")
  private List<Enrollments> enrollments;
  }
