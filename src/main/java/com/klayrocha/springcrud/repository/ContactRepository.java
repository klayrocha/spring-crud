package com.klayrocha.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klayrocha.springcrud.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
