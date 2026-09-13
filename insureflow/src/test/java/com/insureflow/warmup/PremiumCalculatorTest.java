package com.insureflow.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PremiumCalculatorTest {

  @Test
  void appliesRiskMultiplierToBasePremium() {
    assertEquals(600.0, PremiumCalculator.calculate(500.0, 1.2));
  }

  @Test
  void splitsAnnualPremiumIntoMonthlyInstallments() {
    assertEquals(83.0, PremiumCalculator.monthlyFromAnnual(1000), 0.01);
  }
}
