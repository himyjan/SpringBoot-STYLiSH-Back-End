package com.example.restservice.types;

import java.util.List;

public class ProductDetailsData {
  public long id;
  public String category;
  public String title;
  public String description;
  public int price;
  public String texture;
  public String wash;
  public String place;
  public String note;
  public String story;
  public String main_image;
  public List<String> images;
  public List<Variant> variants;
  public List<Color> colors;
  public List<String> sizes;
}
