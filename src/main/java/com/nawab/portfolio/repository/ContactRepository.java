package com.nawab.portfolio.repository;

import com.nawab.portfolio.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactForm, Long> {
}
