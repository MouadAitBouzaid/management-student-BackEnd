package com.example.internshipmanagement.services;

import com.example.internshipmanagement.dtos.EtudiantDTO;
import com.example.internshipmanagement.dtos.ReunionDTO;
import com.example.internshipmanagement.entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface EtudiantService {
    EtudiantDTO save(EtudiantDTO etudiantDTO);
    List<EtudiantDTO> findAll();
    Optional<EtudiantDTO> getEtudiantById(Long reunionId);
    Optional<EtudiantDTO> deleteEtudiant(Long reunionId);
    Optional<EtudiantDTO> updateEtudiant(Long etudiantId, EtudiantDTO etudiantDto);
    EtudiantDTO findByUsername(String username);




}
