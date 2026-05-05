package com.issuetracker.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issuetracker.app.Entity.IssueEntity;
import com.issuetracker.app.Repository.IssueRepository;

@Service

public class IssueServices {

    private final IssueRepository issueRepository;

    public IssueServices(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public List<IssueEntity> getIssueRepository() {
        return issueRepository.findAll();
    }

    public IssueEntity getIssueById(Long id) {
        return issueRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Issue not found"));
    }

    public IssueEntity AddIssue(IssueEntity issue) {
        return issueRepository.save(issue);
    }

    public IssueEntity deleteIssue(Long id) {
        IssueEntity issue = issueRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Issue not found"));
        issueRepository.delete(issue);
        return null;
    }

    public IssueEntity deleteAllIssues() {
        issueRepository.deleteAll();
        return null;
    }

}
