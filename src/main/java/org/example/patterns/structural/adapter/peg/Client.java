package org.example.patterns.structural.adapter.peg;

public class Client {

  public static void main(String[] args) {
    RoundHole roundHole = new RoundHole(5);
    RoundPeg roundPeg = new RoundPeg(5);

    System.out.println(roundHole.isFit(roundPeg));//true

    SquarePeg squarePegW5 = new SquarePeg(5);
    SquarePeg squarePegW7 = new SquarePeg(7);
    SquarePeg squarePegW8 = new SquarePeg(8);

//    roundHole.isFit(smallSquarePeg);

    SquarePegAdapter squarePegW5Adapter = new SquarePegAdapter(squarePegW5);
    SquarePegAdapter squarePegW7Adapter = new SquarePegAdapter(squarePegW7);
    SquarePegAdapter squarePegW8Adapter = new SquarePegAdapter(squarePegW8);

    System.out.println(roundHole.isFit(squarePegW5Adapter));//true
    System.out.println(roundHole.isFit(squarePegW7Adapter));//true
    System.out.println(roundHole.isFit(squarePegW8Adapter));//false
  }
}
