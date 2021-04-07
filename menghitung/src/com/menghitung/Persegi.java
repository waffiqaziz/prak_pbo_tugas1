package com.menghitung;

public class Persegi extends BangunDatar {
  
  public Persegi(int x2) {
    super(x2);
    //TODO Auto-generated constructor stub
  }

  @Override
  double luas() {
    return x * x;
  }

  @Override
  double keliling() {
    return 4 * x;
  }
}
