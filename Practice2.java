public class Practice2 {
    
    static boolean playButton;

        public static void playMusic(){

            if(playButton)System.out.println("Music is playing");
            else System.out.println("Music is paused");

        }
    public static void main(String[] args) throws Exception{

        //Coffee Machine using Switch Statements
        playMusic();
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
