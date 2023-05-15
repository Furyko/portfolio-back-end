package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.Study;
import com.julianpalavecino.portfolio.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/study")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class StudyController {
    @Autowired
    private StudyService studyService;

    @PostMapping("/new")
    public Study newStudy(@RequestBody Study newStudy){
        return this.studyService.newStudy(newStudy);
    }

    @GetMapping("/all")
    public Iterable<Study> getAll() {
        return studyService.getAll();
    }

    @PostMapping("/update")
    public Study updateStudy(@RequestBody Study study) {
        return this.studyService.modifyStudy(study);
    }

    @PostMapping(value = "/{idStudy}")
    public Boolean deleteStudy(@PathVariable(value="idStudy") Long idStudy) {
        return this.studyService.deleteStudy(idStudy);
    }
}
