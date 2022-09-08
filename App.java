public class App {
    public static void main(String[] args) throws Exception {
        //self drive car using if-else statement

        boolean isGreen = true;
        //This boolean expression also can be writtn as;
        // boolean isGreen = 0<1 ;

        if(isGreen){
            System.out.println("drive the car");
        }else{
            System.out.println("Stop the car");
        }

        boolean isRaining = 3>5; //Now it also act as a false statement

        if(isRaining){
            System.out.println("Windshield wipers on.");
        }else{
            System.out.println("Windshield wipers off.");
        }

        //////////////////////////////////////////////////////////////////////

        int ticketPrice = 10;
        int age=0;
        boolean isStudent=false;

        if(age <= 15){
            ticketPrice=5;
        }else if(age > 60){
            ticketPrice=5;
        }else if(isStudent){
            ticketPrice=5;
        }
        System.out.println(ticketPrice);
    }
}
