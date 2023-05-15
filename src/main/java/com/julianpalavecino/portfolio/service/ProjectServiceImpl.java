package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.Project;
import com.julianpalavecino.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project newProject(Project newProject) {
        return projectRepository.save(newProject);
    }

    @Override
    public Iterable<Project> getAll() {
        return this.projectRepository.findAll();
    }

    @Override
    public Project modifyProject(Project project) {
        Optional<Project> foundProject = this.projectRepository.findById(project.getIdProject());
        if (foundProject.get() != null) {
            foundProject.get().setName(project.getName());
            foundProject.get().setDescription(project.getDescription());
            foundProject.get().setUrlRepo(project.getUrlRepo());
            foundProject.get().setUrlSite(project.getUrlSite());
            foundProject.get().setPreviewImg(project.getPreviewImg());
            return this.newProject(foundProject.get());
        }
        return null;
    }

    @Override
    public Boolean deleteProject(Long idProject) {
        this.projectRepository.deleteById(idProject);
        return true;
    }
}
