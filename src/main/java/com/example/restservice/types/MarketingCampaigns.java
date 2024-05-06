package com.example.restservice.types;

import java.util.List;

import com.example.restservice.entities.Campaign;

public class MarketingCampaigns {
    public List<Campaign> data;

    public MarketingCampaigns(List<Campaign> data) {
        this.data = data;
    }
}

// public class MarketingCampaigns {
// public List<CarouselDetails> data;
// }