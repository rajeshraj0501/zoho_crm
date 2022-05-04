package com.zohocrm2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm2.entities.Lead;
import com.zohocrm2.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	
	
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

}
