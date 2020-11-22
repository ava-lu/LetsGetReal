public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0) {
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
    this.reduce();
  }

  public double getValue() {
    return (numerator/denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber flip = new RationalNumber(
    this.getDenominator(), this.getNumerator());
    return flip;
  }

  public boolean equals(RationalNumber other) {
    boolean answer = false;
    if (this.getNumerator() == other.getNumerator() &&
    this.getDenominator() == other.getDenominator()) {
      answer = true;
    }
    return answer;
  }

  public String toString() {
    String newstr = numerator+"/"+denominator;
    return newstr;
  }

  private static int gcd(int a, int b) {
    int answer = 0;
    if (a<0 || b<0) {
      a = Math.abs(a);
      b = Math.abs(b);
      if (a>=b) {
        int remainder = a%b;
        while (remainder != 0) {
          a = b;
          b = remainder;
          remainder = a%b;
        }
        answer = b;
      }
      else {
        int remainder = b%a;
        while (remainder != 0) {
          b = a;
          a = remainder;
          remainder = b%a;
        }
        answer = a;
      }
    }
    else {
      if (a>=b) {
        int remainder = a%b;
        while (remainder != 0) {
          a = b;
          b = remainder;
          remainder = a%b;
        }
        answer = b;
      }
      else {
        int remainder = b%a;
        while (remainder != 0) {
          b = a;
          a = remainder;
          remainder = b%a;
        }
        answer = a;
      }
    }
    return answer;
  }

  private void reduce() {
    int c = gcd(this.getNumerator(), this.getDenominator());
    numerator = numerator / c;
    denominator = denominator / c;
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber product = new
    RationalNumber(this.getNumerator()*other.getNumerator(),
    this.getDenominator()*other.getDenominator());
    return product;
  }

  public RationalNumber divide(RationalNumber other) {
    RationalNumber quotient = new
    RationalNumber(this.getNumerator()*other.getDenominator(),
    this.getDenominator()*other.getNumerator());
    return quotient;
  }

}
