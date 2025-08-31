package OOPS.Inheritance;

public class BoxWeight extends Box {
  double weight;

  public BoxWeight() {
    this.weight = -1;
  }

  public BoxWeight(double l, double w, double h, double weight) {
    super(l, h, w);

    // if main class box also have weight var then to acess it directly we can use

    // System.out.println(super.weight);

    // this will access weight of box class and not of boxWeight class
    this.weight = weight;
  }

  public BoxWeight(double side, double weight) {
    super(side);
    this.weight = weight;
  }
}
