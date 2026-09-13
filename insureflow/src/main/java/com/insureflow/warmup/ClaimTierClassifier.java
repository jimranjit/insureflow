package com.insureflow.warmup;

public class ClaimTierClassifier {
  public static String classify(int tier) {
    if (tier > 10000) return "CRITICAL";
    else if (tier > 5000) return "HIGH";
    else if (tier > 1000) return "STANDARD";
    else return "LOW";
  }
}
