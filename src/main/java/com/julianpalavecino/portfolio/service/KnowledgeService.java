package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.Knowledge;

public interface KnowledgeService {
    Knowledge newKnowledge(Knowledge newKnowledge);
    Iterable<Knowledge> getAll();
    Knowledge modifyKnowledge(Knowledge knowledge);
    Boolean deleteKnowledge(Long idKnowledge);
}
