package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.ExtraProject;
import com.julianpalavecino.portfolio.service.ExtraProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/extra-project")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class ExtraProjectController {
    @Autowired
    private ExtraProjectService extraProjectService;

    @PostMapping("/new")
    public ExtraProject newProject(@RequestBody ExtraProject newProject){
        return this.extraProjectService.newProject(newProject);
    }

    @GetMapping("/all")
    public Iterable<ExtraProject> getAll() {
        return extraProjectService.getAll();
    }

    @PostMapping("/update")
    public ExtraProject updateProject(@RequestBody  ExtraProject project) {
        return this.extraProjectService.modifyProject(project);
    }

    @PostMapping(value = "/{idProject}")
    public Boolean deleteProject(@PathVariable(value="idProject") Long idProject) {
        return this.extraProjectService.deleteProject(idProject);
    }
}
