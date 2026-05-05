package com.issuetracker.app.Controler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issuetracker.app.Entity.FeedbackEntity;
import com.issuetracker.app.Services.FeedbackServices;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackServices feedbackServices;

    public FeedbackController(FeedbackServices feedbackServices) {
        this.feedbackServices = feedbackServices;
    }

    @GetMapping
    public List<FeedbackEntity> getAllFeedbacks() {
        return feedbackServices.getFeedbackRepository();
    }

    @GetMapping("/{id}")
    public FeedbackEntity getFeedbackById(@PathVariable Long id) {
        return feedbackServices.getFeedbackById(id);
    }

    @PostMapping
    public FeedbackEntity AddFeedback(@RequestBody FeedbackEntity feedback) {
        return feedbackServices.AddFeedback(feedback);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFeedback(@PathVariable Long id) {
        feedbackServices.deleteFeedback(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAllFeedbacks() {
        feedbackServices.deleteAllFeedbacks();
        return ResponseEntity.noContent().build();
    }

}
