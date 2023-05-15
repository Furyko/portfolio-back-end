package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.Study;

public interface StudyService {
    Study newStudy(Study newStudy);
    Iterable<Study> getAll();
    Study modifyStudy(Study study);
    Boolean deleteStudy(Long idStudy);
}
