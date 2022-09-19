package com.pradeep.springbootlearning.validation.service;

import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class SampleService {

  public void nullArgumentsCheck(@NotNull String arg) {
    System.out.println(arg.length());
  }
}
