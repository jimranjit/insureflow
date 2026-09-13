package com.insureflow.warmup;

public class PremiumCalculator {
  public static double calculate(double baseAmount, double riskMultiplier) {
    return baseAmount * riskMultiplier;
  }

  public static double monthlyFromAnnual(int annualPremium) {
    return annualPremium / 12;
  }
}
