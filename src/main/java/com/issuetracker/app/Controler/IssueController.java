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

import com.issuetracker.app.Entity.IssueEntity;
import com.issuetracker.app.Services.IssueServices;

@RestController
@RequestMapping("/issue")
public class IssueController {

    private final IssueServices issueServices;

    public IssueController(IssueServices issueServices) {
        this.issueServices = issueServices;
    }

    @GetMapping
    public List<IssueEntity> getAllIssues() {
        return issueServices.getIssueRepository();
    }

    @GetMapping("/{id}")
    public IssueEntity getIssueById(@PathVariable Long id) {
        return issueServices.getIssueById(id);
    }

    @PostMapping
    public IssueEntity addIssue(@RequestBody IssueEntity issue) {
        return issueServices.AddIssue(issue);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIssue(@PathVariable Long id) {
        issueServices.deleteIssue(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllIssues() {
        issueServices.deleteAllIssues();
        return ResponseEntity.noContent().build();
    }

}
