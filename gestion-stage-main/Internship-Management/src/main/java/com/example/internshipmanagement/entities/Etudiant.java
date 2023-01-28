package com.example.internshipmanagement.entities;

import com.example.internshipmanagement.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String niveau;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(mappedBy = "etudiantDoc", fetch = FetchType.EAGER)
    private List<Document> documents;
    @ManyToOne
    private Etablissement etablissement;
    @ManyToOne
    private Professeur professeur;
    @OneToMany(mappedBy = "etudiant", fetch = FetchType.EAGER)
    private List<Reunion> reunions;
}
