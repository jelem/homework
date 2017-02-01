package com.hillel.tips;

public class Main {
  public static void main(String[] args) {
    Service service = new GoodService();
    long tips = service.countTips(300);
    System.out.println("Tips for this type of service are " + tips);
    service = new ExcellentService();
    tips = service.countTips(900);
    System.out.println("Tips for this type of service are " + tips);
  }
}
