package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.Project;
import com.julianpalavecino.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/new")
    public Project newProject(@RequestBody Project newProject){
        return this.projectService.newProject(newProject);
    }

    @GetMapping("/all")
    public Iterable<Project> getAll() {
        return projectService.getAll();
    }

    @PostMapping("/update")
    public Project updateProject(@RequestBody  Project project) {
        return this.projectService.modifyProject(project);
    }

    @PostMapping(value = "/{idProject}")
    public Boolean deleteProject(@PathVariable(value="idProject") Long idProject) {
        return this.projectService.deleteProject(idProject);
    }
}
