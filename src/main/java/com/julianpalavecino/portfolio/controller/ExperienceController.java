package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.Experience;
import com.julianpalavecino.portfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @PostMapping("/new")
    public Experience newExperience(@RequestBody Experience newExperience){
        return this.experienceService.newExperience(newExperience);
    }

    @GetMapping("/all")
    public Iterable<Experience> getAll() {
        return experienceService.getAll();
    }

    @PostMapping("/update")
    public Experience updateExperience(@RequestBody Experience experience) {
        return this.experienceService.modifyExperience(experience);
    }

    @PostMapping(value = "/{idExperience}")
    public Boolean deleteExperience(@PathVariable(value="idExperience") Long idExperience) {
        return this.experienceService.deleteExperience(idExperience);
    }
}
