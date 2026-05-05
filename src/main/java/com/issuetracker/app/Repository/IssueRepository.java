package com.issuetracker.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.issuetracker.app.Entity.IssueEntity;

public interface  IssueRepository extends JpaRepository<IssueEntity, Long> {

    @Override
    Optional<IssueEntity> findById(Long id);
    
}
