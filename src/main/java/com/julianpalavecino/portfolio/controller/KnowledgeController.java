package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.Knowledge;
import com.julianpalavecino.portfolio.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/knowledge")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class KnowledgeController {
    @Autowired
    private KnowledgeService knowledgeService;

    @PostMapping("/new")
    public Knowledge newKnowledge(@RequestBody Knowledge newKnowledge){
        return this.knowledgeService.newKnowledge(newKnowledge);
    }

    @GetMapping("/all")
    public Iterable<Knowledge> getAll() {
        return knowledgeService.getAll();
    }

    @PostMapping("/update")
    public Knowledge updateKnowledge(@RequestBody  Knowledge knowledge) {
        return this.knowledgeService.modifyKnowledge(knowledge);
    }

    @PostMapping(value = "/{idKnowledge}")
    public Boolean deleteKnowledge(@PathVariable(value="idKnowledge") Long idKnowledge) {
        return this.knowledgeService.deleteKnowledge(idKnowledge);
    }
}
