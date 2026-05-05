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

import com.issuetracker.app.Entity.AcknowlegementEntity;
import com.issuetracker.app.Services.AcknowlegementService;

@RestController
@RequestMapping("/acknowlegement")
public class AcknowlegementController {

    private final AcknowlegementService acknowlegementService;

    public AcknowlegementController(AcknowlegementService acknowlegementService) {
        this.acknowlegementService = acknowlegementService;
    }

    @GetMapping
    public List<AcknowlegementEntity> getAllAcknowlegements() {
        return acknowlegementService.getAcknowlegementRepository();
    }

    @GetMapping("/{id}")
    public AcknowlegementEntity getAcknowlegementById(@PathVariable Long id) {
        return acknowlegementService.getAcknowlegementById(id);
    }

    @PostMapping
    public AcknowlegementEntity addAcknowlegement(@RequestBody AcknowlegementEntity acknowlegement) {
        return acknowlegementService.AddAcknowlegement(acknowlegement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAcknowlegement(@PathVariable Long id) {
        acknowlegementService.deleteAcknowlegement(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllAcknowlegements() {
        acknowlegementService.deleteAllAcknowlegements();
        return ResponseEntity.noContent().build();
    }

}
