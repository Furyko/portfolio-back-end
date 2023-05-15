package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.ExtraProject;

public interface ExtraProjectService {
    ExtraProject newProject(ExtraProject newProject);
    Iterable<ExtraProject> getAll();
    ExtraProject modifyProject(ExtraProject project);
    Boolean deleteProject(Long idProject);
}
