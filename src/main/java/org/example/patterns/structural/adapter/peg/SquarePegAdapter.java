package org.example.patterns.structural.adapter.peg;

public class SquarePegAdapter extends RoundPeg {

  public SquarePegAdapter(SquarePeg squarePeg) {
    super(squarePeg.getWidth());
  }

  @Override
  public double getRadius() {
    return super.getRadius() * Math.sqrt(2) / 2;
  }
}
