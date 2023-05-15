package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.Experience;

public interface ExperienceService {
    Experience newExperience(Experience newExperience);
    Iterable<Experience> getAll();
    Experience modifyExperience(Experience experience);
    Boolean deleteExperience(Long idExperience);
}
