public class Tester {
  public static void main(String[] args) {

    /*
    RealNumber a = new RealNumber(0.728);
    RealNumber b = new RealNumber(0.22);
    System.out.println(a.equals(b));
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    System.out.println(a.divide(b));
    System.out.println(a.subtract(b));
    */

    /*
    RationalNumber c = new RationalNumber(1, 3);
    RationalNumber d = new RationalNumber(2,5);
    RationalNumber e = new RationalNumber(1, 3);
    System.out.println(d.getValue());
    System.out.println(d.reciprocal().getNumerator());
    System.out.println(d.reciprocal().getDenominator());
    System.out.println(c.equals(d));
    System.out.println(c.equals(e));

    System.out.println(c.toString());
    */

    //System.out.println(RationalNumber.gcd(15, 10));
    //System.out.println(RationalNumber.gcd(-15,10));

    /*
    RationalNumber f = new RationalNumber(-2, -6);
    System.out.println(f.getNumerator());
    System.out.println(f.getDenominator());
    */

    RationalNumber g = new RationalNumber(1, 2);
    RationalNumber h = new RationalNumber (3, 4);
    System.out.println(g.multiply(h));
    System.out.println(g.divide(h));
    System.out.println(g.add(h));
  }
}
