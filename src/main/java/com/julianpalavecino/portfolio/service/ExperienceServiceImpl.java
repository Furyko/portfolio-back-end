package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.Experience;
import com.julianpalavecino.portfolio.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public Experience newExperience(Experience newExperience) {
        return experienceRepository.save(newExperience);
    }

    @Override
    public Iterable<Experience> getAll() {
        return this.experienceRepository.findAll();
    }

    @Override
    public Experience modifyExperience(Experience experience) {
        Optional<Experience> foundExperience = this.experienceRepository.findById(experience.getIdExperience());
        if (foundExperience.get() != null) {
            foundExperience.get().setProjectName(experience.getProjectName());
            foundExperience.get().setDescription(experience.getDescription());
            return this.newExperience(foundExperience.get());
        }
        return null;
    }

    @Override
    public Boolean deleteExperience(Long idExperience) {
        this.experienceRepository.deleteById(idExperience);
        return true;
    }
}
