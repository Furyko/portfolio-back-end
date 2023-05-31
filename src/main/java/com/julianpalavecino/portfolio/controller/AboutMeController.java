package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.AboutMe;
import com.julianpalavecino.portfolio.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/about-me")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class AboutMeController {
    @Autowired
    private AboutMeService aboutMeService;

    @PostMapping("/new")
    public AboutMe newAboutMe(@RequestBody AboutMe newAboutMe){
        return this.aboutMeService.newAboutMe(newAboutMe);
    }

    @GetMapping("/all")
    public Iterable<AboutMe> getAll() {
        return aboutMeService.getAll();
    }

    @GetMapping("/{idAboutMe}")
    public Optional<AboutMe> getById(@PathVariable(value="idAboutMe") Long idAboutMe) {
        return aboutMeService.getById(idAboutMe);
    }

    @PutMapping("/update")
    public AboutMe updateAboutMe(@RequestBody AboutMe aboutMe) {
        return this.aboutMeService.modifyAboutMe(aboutMe);
    }

    @DeleteMapping(value = "/{idAboutMe}")
    public Boolean deleteAboutMe(@PathVariable(value="idAboutMe") Long idAboutMe) {
        return this.aboutMeService.deleteAboutMe(idAboutMe);
    }
}
