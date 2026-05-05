package com.issuetracker.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.issuetracker.app.Entity.FeedbackEntity;

public interface  FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {
    
    @Override
    Optional<FeedbackEntity> findById(Long id);
    
}
