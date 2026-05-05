package com.issuetracker.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issuetracker.app.Entity.FeedbackEntity;
// import com.issuetracker.app.Entity.ResolveEntity;
import com.issuetracker.app.Repository.FeedbackRepository;
// import com.issuetracker.app.Repository.feedbackRepository;

@Service
public class FeedbackServices {
    private final FeedbackRepository feedbackRepository;

    public FeedbackServices(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }
    
    public List<FeedbackEntity> getFeedbackRepository() {
        return feedbackRepository.findAll();
    }

    public FeedbackEntity getFeedbackById(Long id) {
        return feedbackRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Feedback not found"));
    }
    public FeedbackEntity AddFeedback(FeedbackEntity feedback) {
        return feedbackRepository.save(feedback);
    }
    public FeedbackEntity deleteFeedback(Long id) {
        FeedbackEntity feedback = feedbackRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Feedback not found"));
        feedbackRepository.delete(feedback);
        return null;
    }
    public FeedbackEntity deleteAllFeedbacks() {
        feedbackRepository.deleteAll();
        return null;
    }
}
