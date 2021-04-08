package com.menghitung;

public class Silinder extends BangunRuang {

  public Silinder(int x, int y) {
    super(x, y);
    // x = jari-jari, y = tinggi silinder
  }

  @Override
  double luas() {
    return 2 * Math.PI * x * y + 2 * Math.PI * x * x;
  }

  @Override
  double volume() {
    return Math.PI * x * x * y;
  }

}
