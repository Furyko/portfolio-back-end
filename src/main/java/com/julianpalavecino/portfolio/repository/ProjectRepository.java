package com.julianpalavecino.portfolio.repository;

import com.julianpalavecino.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
