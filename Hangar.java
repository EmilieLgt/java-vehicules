public class Hangar {

  public static void main(String[] args) {
    Car voiture = new Car("Clio", 12);
    Boat bateau = new Boat("Titanic", 1);
    System.out.println(voiture.doStuff());
    System.out.println(bateau.doStuff());

  }
}