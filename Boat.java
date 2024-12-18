public class Boat extends Vehicule {

public Boat (String brand, int kilometers){
  super (brand, kilometers);

}

// implémentation méthode abstraite
@Override
public String doStuff(){
return ("Je suis " + this.getBrand() +"  je fais glou glou !" );
}
  
}