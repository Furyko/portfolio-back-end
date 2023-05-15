package com.julianpalavecino.portfolio.repository;

import com.julianpalavecino.portfolio.entity.Knowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeRepository extends JpaRepository<Knowledge, Long> {
}
