public class Practice2 {
    
     static boolean playButton;

        public static void playMusic(){

            if(playButton)System.out.println("Music is playing");
            else System.out.println("Music is paused");

        }
    
        public static void weather(int weight){

            //Parameters are variables that are used
            //And Aeguments are the actual values that are passing 

            if(weight>70)System.out.println("You are above 70");
            else if(weight<50)System.out.println("You are under 50");
            else System.out.println("You are fit");

        }
    public static void main(String[] args) throws Exception{

        

        playMusic();
        weather(34);
        weather(55);
        weather(80);

        //Coffee Machine using Switch Statements

        int passcode = 123;
        String coffeeType;

        switch(passcode){

            case 221: coffeeType = "espresso";
            break;
            case 123: coffeeType = "Vanilla latte";
            break;
            case 345: coffeeType = "Drip coffee";
            break;
            default : coffeeType = "Unknown";

        }
        System.out.println(coffeeType);

        

        
        
        

        

    }
    

}
