package com.issuetracker.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jdk.jfr.Description;
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
    private Description description;

    @OneToOne(mappedBy = "acknowledgement")
    private ResolveEntity resolveEntity;
}
