public class RealNumber {
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return ""+getValue();
  }

  public boolean equals(RealNumber other) {
    boolean answer = false;
    if (this.getValue() == 0 && other.getValue() == 0) answer = true;
    double value = Math.abs((this.getValue() - other.getValue()) / other.getValue());
    if (value < 0.00001) answer = true;
    return answer;
  }

  public RealNumber add(RealNumber other) {
    double val = this.getValue() + other.getValue();
    RealNumber sum = new RealNumber(val);
    return sum;
  }
}
