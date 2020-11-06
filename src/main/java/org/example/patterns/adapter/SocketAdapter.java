package org.example.patterns.adapter;

public class SocketAdapter {
  public static void main(String[] args) {
    Radio euroRadioInEU = new Radio();
    EuroSocket euroSocket = new EuroSocketImpl();
    euroRadioInEU.listenMusic(euroSocket);

    Radio euroRadioInUSA = new Radio();
    AmericanSocket americanSocket = new AmericanSocketImpl();
    EuroSocket euroToAmericanSocketAdapter = new EuroToAmericanSocketAdapter(americanSocket);
    euroRadioInUSA.listenMusic(euroToAmericanSocketAdapter);

  }
}

class EuroToAmericanSocketAdapter implements EuroSocket {
  AmericanSocket americanSocket;

  public EuroToAmericanSocketAdapter(AmericanSocket americanSocket) {
    this.americanSocket = americanSocket;
  }

  @Override
  public void getPower() {
    americanSocket.getPower();
  }
}

interface AmericanSocket {
  void getPower();
}

interface EuroSocket {
  void getPower();
}

class AmericanSocketImpl implements AmericanSocket {
  @Override
  public void getPower() {
    System.out.println("use 110 volt");
  }
}

class EuroSocketImpl implements EuroSocket {
  @Override
  public void getPower() {
    System.out.println("use 220 volt");
  }
}

class Radio {
  public void listenMusic(EuroSocket euroSocket) {
    euroSocket.getPower();
  }
}