package com.menghitung;

public class persegiPanjang extends bangunDatar {
  persegiPanjang(int x, int y) {
    super(x, y);
  }

  @Override
  double luas() {
    return x*y;
  }

  @Override
  double keliling() {
    return 2*(x+y);
  }
}
