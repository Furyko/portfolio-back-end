package com.julianpalavecino.portfolio.repository;

import com.julianpalavecino.portfolio.entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {
}
