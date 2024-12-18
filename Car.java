public class Car extends Vehicule {

  public Car (String brand, int kilometers){
    super (brand, kilometers);
  }

// implémentation méthode abstraite
@Override
public String doStuff(){
return ("Je suis " + this.getBrand() +"  je fais vroum vroum !" );
}
}