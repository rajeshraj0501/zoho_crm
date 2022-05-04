package com.zohocrm2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
