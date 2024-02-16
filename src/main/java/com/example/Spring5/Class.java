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
public class Class {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id_class;
    @Column(nullable = false)
    private String title;
    @Column (nullable = false)
    private String description;
    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;
}
