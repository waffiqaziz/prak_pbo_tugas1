package com.menghitung;

public class Lingkaran extends bangunDatar {

  Lingkaran(int x2) {
    super(x2);
    // TODO Auto-generated constructor stub
  }

  @Override
  double luas() {
    return Math.PI * (x * x) * 1d;
  }

  @Override
  double keliling() {
    return 2d * Math.PI * x;
  }
}
