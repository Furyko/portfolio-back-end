package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.Knowledge;
import com.julianpalavecino.portfolio.repository.KnowledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {
    @Autowired
    private KnowledgeRepository knowledgeRepository;

    @Override
    public Knowledge newKnowledge(Knowledge newKnowledge) {
        return knowledgeRepository.save(newKnowledge);
    }

    @Override
    public Iterable<Knowledge> getAll() {
        return this.knowledgeRepository.findAll();
    }

    @Override
    public Knowledge modifyKnowledge(Knowledge knowledge) {
        Optional<Knowledge> foundKnowledge = this.knowledgeRepository.findById(knowledge.getIdKnowledge());
        if (foundKnowledge.get() != null) {
            foundKnowledge.get().setArea(knowledge.getArea());
            foundKnowledge.get().setTechnologies(knowledge.getTechnologies());
            return this.newKnowledge(foundKnowledge.get());
        }
        return null;
    }

    @Override
    public Boolean deleteKnowledge(Long idKnowledge) {
        this.knowledgeRepository.deleteById(idKnowledge);
        return true;
    }
}
