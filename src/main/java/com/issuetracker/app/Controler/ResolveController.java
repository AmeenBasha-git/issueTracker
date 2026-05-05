package com.issuetracker.app.Controler;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issuetracker.app.Entity.ResolveEntity;
import com.issuetracker.app.Services.ResolveServices;

@RestController
@RequestMapping("/resolve")
public class ResolveController {
    private final ResolveServices resolveServices;

    public ResolveController(ResolveServices resolveServices) {
        this.resolveServices = resolveServices;
    }
    @GetMapping
    public List<ResolveEntity> GetResovlveRepository() {
        return resolveServices.getResolveRepository();
    }
    @GetMapping("/{id}")
    public ResolveEntity GetResolveById(@PathVariable Long id) {
        return resolveServices.getResolveById(id);
    }
    @PostMapping
    public ResolveEntity AddResolve(@RequestBody ResolveEntity resolve) {
        return resolveServices.AddResolve(resolve);
    }

    @DeleteMapping("/{id}")
    public ResolveEntity deleteResolve(@PathVariable Long id) {
        return resolveServices.deleteResolve(id);
    }
    @DeleteMapping
    public ResolveEntity deleteAllResolves() {
        return resolveServices.deleteAllResolves();
    }
}
