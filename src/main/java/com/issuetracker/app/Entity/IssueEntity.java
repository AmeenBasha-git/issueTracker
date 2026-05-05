package com.issuetracker.app.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "issue")
public class IssueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Type;
    private String name;
    private String Location;
    private String description;

    @OneToMany(mappedBy = "issue")
    private List<AcknowlegementEntity> acknowledgements;

    @OneToMany(mappedBy = "issueEntity")
    private List<FeedbackEntity> feedbacks;

}