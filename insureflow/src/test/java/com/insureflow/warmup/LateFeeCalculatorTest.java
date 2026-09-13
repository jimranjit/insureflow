package com.insureflow.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LateFeeCalculatorTest {
  @Test
  void withinGracePeriodChargesFlatRate() {
    assertEquals(30.0, LateFeeCalculator.calculate(3));
  }

  @Test
  void beyondGracePeriodChargesFlatRate() {
    assertEquals(80.0, LateFeeCalculator.calculate(5));
  }
}
