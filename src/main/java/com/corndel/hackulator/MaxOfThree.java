package com.corndel.hackulator;

public class MaxOfThree {

  static int maxOfThree(int x, int y, int z) {
    if (x > y && x > z) {
      return x;
    }

    if (y > z && y > x) {
      return y;
    }

    if (z > x && z > y) {
      return z;
    }

    if (x == y && x == z) {
      return x;
    }

    if (x == y && x > z) {
      return x;
    } else if (x == z && x > y) {
      return x;
    } else {
      return y;
    }
  }
}
