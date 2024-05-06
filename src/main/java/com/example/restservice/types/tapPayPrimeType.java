package com.example.restservice.types;

import java.util.List;

class Card {
  public String prime;
  public String bincode;
  public String lastfour;
  public String issuer;
  public String issuer_zh_tw;
  public String bank_id;
  public int funding;
  public int type;
  public String level;
  public String country;
  public String countrycode;
}

class Affiliate_codes {
  public List<String> affiliate_codes;
}

class Prime {
  public int status;
  public Card card;
  public String clientip;
  public String card_identifier;
  public Affiliate_codes merchant_reference_info;
}
