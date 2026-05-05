package com.issuetracker.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "resolve")
public class ResolveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean completed;
    private Boolean processing ;
    private String admin_name;

    @OneToOne
    @JoinColumn(name = "acknowledgement_id")
    private AcknowlegementEntity acknowledgement;
}