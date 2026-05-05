package com.issuetracker.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "acknowledgement")
public class AcknowlegementEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private Boolean approve;
    private String type;
    private String location;
    private String description;

    @ManyToOne
    @JoinColumn(name = "issue_id")
    private IssueEntity issue;

    @OneToOne(mappedBy = "acknowledgement")
    private ResolveEntity resolveEntity;
}
