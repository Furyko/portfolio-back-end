package com.julianpalavecino.portfolio.repository;

import com.julianpalavecino.portfolio.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
