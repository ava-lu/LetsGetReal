public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      nume = 0;
      deno = 1;
    }
    if (deno < 0) {
      nume = nume * -1;
      deno = deno * -1;
    }
  }

}
