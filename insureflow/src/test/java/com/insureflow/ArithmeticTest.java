package com.insureflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {
  @Test
  void addsTwoNumbers() {
    assertEquals(4, Arithmetic.add(2, 2));
  }
}
