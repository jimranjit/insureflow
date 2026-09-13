package com.insureflow.warmup;

public class LateFeeCalculator {
  public static double calculate(int daysLate) {
    double lateFee = 0;
    for (int day = 1; day <= daysLate; day++) {
      lateFee += day <= 3 ? 10 : 25;
    }
    return lateFee;
  }
}
