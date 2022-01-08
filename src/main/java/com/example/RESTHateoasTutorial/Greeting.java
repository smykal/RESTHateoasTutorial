package com.example.RESTHateoasTutorial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;

@Getter
public class Greeting extends RepresentationModel<Greeting> {
  private final String content;

  @JsonCreator
  public Greeting(@JsonProperty("content") String content){
    this.content = content;
  }
}
