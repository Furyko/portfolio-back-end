package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.Study;
import com.julianpalavecino.portfolio.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudyServiceImpl implements StudyService {
    @Autowired
    private StudyRepository studyRepository;

    @Override
    public Study newStudy(Study newStudy) {
        return studyRepository.save(newStudy);
    }

    @Override
    public Iterable<Study> getAll() {
        return this.studyRepository.findAll();
    }

    @Override
    public Study modifyStudy(Study study) {
        Optional<Study> foundStudy = this.studyRepository.findById(study.getIdStudy());
        if (foundStudy.get() != null) {
            foundStudy.get().setTitle(study.getTitle());
            foundStudy.get().setInstituteName(study.getInstituteName());
            return this.newStudy(foundStudy.get());
        }
        return null;
    }

    @Override
    public Boolean deleteStudy(Long idStudy) {
        this.studyRepository.deleteById(idStudy);
        return true;
    }
}
