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

    RationalNumber c = new RationalNumber(1, 3);
    RationalNumber d = new RationalNumber(2,5);
    System.out.println(d.reciprocal().getNumerator());
    System.out.println(d.reciprocal().getDenominator());

  }
}
