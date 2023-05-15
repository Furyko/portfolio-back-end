package com.julianpalavecino.portfolio.repository;

import com.julianpalavecino.portfolio.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
