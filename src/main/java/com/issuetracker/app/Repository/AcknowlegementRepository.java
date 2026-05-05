package com.issuetracker.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.issuetracker.app.Entity.AcknowlegementEntity;

public interface  AcknowlegementRepository extends JpaRepository<AcknowlegementEntity, Long>{
    
    @Override
    Optional<AcknowlegementEntity> findById(Long id);
}
