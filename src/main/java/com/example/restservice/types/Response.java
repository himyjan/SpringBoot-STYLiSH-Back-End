package com.example.restservice.types;

class AuthResponse {
  public String accessToken;
}

public class Response {
  public AuthResponse authResponse;
  public String status;
  public String statusText;
  public String error;
  public String text;
  public String json;
  // error: Error;
  // text: () => String;
  // json: () => String;
}
