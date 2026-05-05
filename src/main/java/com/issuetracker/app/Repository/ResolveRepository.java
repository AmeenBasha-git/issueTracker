package com.issuetracker.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.issuetracker.app.Entity.ResolveEntity;

public interface ResolveRepository extends JpaRepository<ResolveEntity,Long>{

    @Override
    Optional<ResolveEntity> findById(Long id);
    
}
