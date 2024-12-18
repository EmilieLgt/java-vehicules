public abstract class Vehicule {
private String brand; 
private int kilometers;

// constructeur
public Vehicule (String brand, int kilometers){
this.brand = brand;
this.kilometers = kilometers;
}

// getters
public String getBrand(){
return this.brand;
}
public int getkilometers(){
  return this.kilometers;
  }
// setters
public void setBrand(String newBrand){
  this.brand = newBrand;
}
public void setKilometers(int newKilometers){
  this.kilometers = newKilometers;
};

// méthode abstraite
public abstract String doStuff();

}