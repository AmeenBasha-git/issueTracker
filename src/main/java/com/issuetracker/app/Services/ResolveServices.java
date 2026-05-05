package com.issuetracker.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issuetracker.app.Entity.ResolveEntity;
import com.issuetracker.app.Repository.ResolveRepository;

@Service
public class ResolveServices {

    private final ResolveRepository resolveRepository;

    public ResolveServices(ResolveRepository resolveRepository) {
        this.resolveRepository = resolveRepository;
    }

    public List<ResolveEntity> getResolveRepository() {
        return resolveRepository.findAll();
    }

    public ResolveEntity getResolveById(Long id) {
        return resolveRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Resolve not found"));
    }

    public ResolveEntity AddResolve(ResolveEntity resolve) {
        return resolveRepository.save(resolve);
    }

    public ResolveEntity deleteResolve(Long id) {
        ResolveEntity resolve = resolveRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Resolve not found"));
        resolveRepository.delete(resolve);
        return null;
    }

    public ResolveEntity deleteAllResolves() {
        resolveRepository.deleteAll();
        return null;
    }

}
