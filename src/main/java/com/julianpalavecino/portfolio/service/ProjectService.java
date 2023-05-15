package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.Project;

public interface ProjectService {
    Project newProject(Project newProject);
    Iterable<Project> getAll();
    Project modifyProject(Project project);
    Boolean deleteProject(Long idProject);
}
