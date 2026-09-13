package com.insureflow.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClaimTierClassifierTest {
  // classifiesLowValueClaims
  // exactlyAtThresholdStaysInLowerTier
  // classifiesCriticalClaims
  @Test
  void classifiesLowValueClaims() {
    assertEquals("LOW", ClaimTierClassifier.classify(500));
  }

  @Test
  void exactlyAtThresholdStaysInLowerTier() {
    assertEquals("STANDARD", ClaimTierClassifier.classify(5000));
  }

  @Test
  void classifiesCriticalClaims() {
    assertEquals("CRITICAL", ClaimTierClassifier.classify(15000));
  }
}
