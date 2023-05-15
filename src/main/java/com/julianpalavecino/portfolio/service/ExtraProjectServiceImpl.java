package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.ExtraProject;
import com.julianpalavecino.portfolio.repository.ExtraProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExtraProjectServiceImpl implements ExtraProjectService {
    @Autowired
    private ExtraProjectRepository extraProjectRepository;

    @Override
    public ExtraProject newProject(ExtraProject newProject) {
        return extraProjectRepository.save(newProject);
    }

    @Override
    public Iterable<ExtraProject> getAll() {
        return this.extraProjectRepository.findAll();
    }

    @Override
    public ExtraProject modifyProject(ExtraProject project) {
        Optional<ExtraProject> foundProject = this.extraProjectRepository.findById(project.getIdProject());
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
        this.extraProjectRepository.deleteById(idProject);
        return true;
    }
}
