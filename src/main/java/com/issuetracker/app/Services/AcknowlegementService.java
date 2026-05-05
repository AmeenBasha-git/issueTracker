package com.issuetracker.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issuetracker.app.Entity.AcknowlegementEntity;
import com.issuetracker.app.Repository.AcknowlegementRepository;

@Service
public class AcknowlegementService {
    
    private final AcknowlegementRepository acknowlegementRepository;
    
    public AcknowlegementService(AcknowlegementRepository acknowlegementRepository) {
        this.acknowlegementRepository = acknowlegementRepository;
    }

    public List<AcknowlegementEntity> getAcknowlegementRepository() {
        return acknowlegementRepository.findAll();
    }

    public AcknowlegementEntity getAcknowlegementById(Long id) {
        return acknowlegementRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Acknowlegement not found"));
    }

    public AcknowlegementEntity AddAcknowlegement(AcknowlegementEntity acknowlegement) {
        return acknowlegementRepository.save(acknowlegement);
    }

    public AcknowlegementEntity deleteAcknowlegement(Long id) {
        AcknowlegementEntity acknowlegement = acknowlegementRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Acknowlegement not found"));
        acknowlegementRepository.delete(acknowlegement);
        return null;
    }

    public AcknowlegementEntity deleteAllAcknowlegements() {
        acknowlegementRepository.deleteAll();
        return null;
    }
}