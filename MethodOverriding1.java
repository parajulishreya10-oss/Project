class GenericVehicle{
    double basespeed=150;
    double speed(double userspeed){
        return userspeed;
    }
}
class Car extends GenericVehicle{
    double speed(double userspeed){
        if (userspeed>basespeed){
            System.out.println("user is fined");
        }
        return userspeed;
    }
}
class Bike extends GenericVehicle{
    double speed(double userspeed){
        if(userspeed>basespeed){
            System.out.println("bike user is fined");
        }
        return userspeed;
    }
}
public class MethodOverriding1{
    public static void main(String [] args){
        GenericVehicle car=new Car();
        GenericVehicle bike=new Bike();
        car.speed(120);
        bike.speed(350);  
    }
}
