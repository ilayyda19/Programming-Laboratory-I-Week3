package labweek_3;


public class LabWeek_3 {

    
    public static void main(String[] args) {
        
        Car myCar = new Car("34 ABC 123", "Ford Focus", 20.0, 50.0);
        myCar.checkStatus();


        myCar.drive(120);
        myCar.checkStatus();

        
        myCar.drive(50);
        myCar.checkStatus();

 
        myCar.drive(60);
        myCar.checkStatus();

        
       
    }
    
}
