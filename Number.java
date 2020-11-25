public abstract class Number {
  public abstract double getValue();

  public boolean equals(Number other) {
    boolean answer = false;
    if (this.getValue() == 0 && other.getValue() == 0) answer = true;
    double value = Math.abs((this.getValue() - other.getValue()) / this.getValue());
    if (value < 0.00001) answer = true;
    return answer;
  }

}
