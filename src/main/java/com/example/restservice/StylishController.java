package com.example.restservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.entities.Campaign;
import com.example.restservice.types.MarketingCampaigns;
import com.example.restservice.repository.CampaignRepository;

@RestController
public class StylishController {

	private final CampaignRepository repository;

	StylishController(CampaignRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/api/1.0/marketing/campaigns")
	public MarketingCampaigns all() {
		return new MarketingCampaigns(repository.findAll());
	}
}
