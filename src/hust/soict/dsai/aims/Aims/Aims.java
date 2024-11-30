package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
      Cart anOrder = new Cart();
      DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation","Roger Allers", 87, 19.95f);
      anOrder.addDigitalVideoDisc(dvd1);
      DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 87, 24.95f);
      anOrder.addDigitalVideoDisc(dvd2);
      DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
      anOrder.addDigitalVideoDisc(dvd3);
  
      System.out.println("Total of cost is:");
      System.out.println(anOrder.totalCost());
  
      anOrder.removeDigitalVideoDisc(dvd3);
      System.out.println("Now, total of cost is:");
      System.out.println(anOrder.totalCost());
      anOrder.printCart();
    }
  }
  