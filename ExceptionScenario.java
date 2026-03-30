import java.util.Scanner;
class SeatNotAvailableException extends Exception{
    SeatNotAvailableException(String message ){
        super(message);
    }
}
class Movie{
    String moviename;
    int availableseats;
    Movie (String moviename, int seats){
        this.moviename=moviename;
        this.availableseats=seats;
    }
    void bookticket(int seats)throws SeatNotAvailableException{
        if(seats<=0){
            System.out.println("no tickets booked");
        }else if  (seats > availableseats){
            throw new SeatNotAvailableException(
            "only" + availableseats +"are available"
        );
            
        }else{
            availableseats=availableseats-seats;
            System.out.println("booking done");
            System.out.println("remainingseats:"+availableseats);
        }
    }
}
public class ExceptionScenario{
    public static void main(String [] args){
    Movie m= new Movie("ddlj",120);
    Scanner sc = new Scanner (System.in);
    try{
        System.out.println("enter seats to book:");
        int seats=sc.nextInt();
        m.bookticket(seats);
    }catch(SeatNotAvailableException e){
        System.out.println("seats not available:"+ e.getMessage());
    }
    sc.close();
}

}