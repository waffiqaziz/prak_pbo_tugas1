package com.menghitung;

public class Segitiga extends bangunDatar {

  Segitiga(int x, int y) {
    super(x, y);
  }

  @Override
  double luas() {
    return 1d / 2 * x * y;
  }

  @Override
  double keliling() {
    return Math.sqrt(x * x + y * y) + x + y;
  }
}