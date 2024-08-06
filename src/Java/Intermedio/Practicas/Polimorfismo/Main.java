package Java.Intermedio.Practicas.Polimorfismo;

class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElVehicle();
        Vehicle hybrid = new HybridVehicle();

        //calls
        vehicle.start();
        vehicle.resource();
        electric.start();
        electric.resource();
        hybrid.start();
        hybrid.resource();
    }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use electricity");
    }
    /*reimplement resource() method
    to output "I use electricity"*/

}

class HybridVehicle extends Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }
    /*reimplement resource() method
    to output "I use both petrol and electricity"*/

}