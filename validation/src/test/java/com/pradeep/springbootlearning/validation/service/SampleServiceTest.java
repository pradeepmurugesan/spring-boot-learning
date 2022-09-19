package com.pradeep.springbootlearning.validation.service;

import javax.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleServiceTest {

  @Autowired
  SampleService sampleService;

  @Test
  void shouldThrowAnExceptionInCaseNullIsPassedIn() {
    Assertions.assertThrows( ConstraintViolationException.class, () -> sampleService.nullArgumentsCheck(null));
  }

}
