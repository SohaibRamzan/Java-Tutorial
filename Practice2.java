public class Practice2 {
    
     static boolean playButton;


        public static void heading(int num){
            System.out.println("************ " + num + " ************");
        }

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

        ////////////// More Than One Parameters ////////////////

        static boolean inColor;

        public static void printPhoto(int height, int width, boolean inColor){

            System.out.println("Height = "+ height);
            System.out.println("Width = "+ width);

            if(inColor) System.out.println("Photo is colorful");
            else System.out.println("Photo is Black n white");

        }

        ////////////// Liking Photo function ////////////////

        
        public static int likePhoto(int likeCount, String comment, boolean like ){

            System.out.println("Comment : " + comment);
            if(like) likeCount = likeCount + 1;

            System.out.println("Likes : " + likeCount);

            return likeCount;

        }
        



    public static void main(String[] args) throws Exception{

        
//// 1 ////
        heading(1);
        playMusic();
//// 2 ////     
        heading(2);
        weather(34);
        weather(55);
        weather(80);
//// 3 ////
        heading(3);
        printPhoto(30,40,true);
        printPhoto(25, 35, false);
//// 4 ////
        heading(4);
        likePhoto(45,"Very Nice Picture",true);
        likePhoto(45,"Nice Picture",false);
//// 5 ////
        heading(5);
        int returnedlikes = likePhoto(45, "we return the likecount and equals them to returnedlikes", true);
        System.out.println("Returned Likes : "+returnedlikes);
        int totalLikes = likePhoto(returnedlikes, "we use the returnedLikes as a parameter of function for getting update likes and equals them to totalLikes", inColor);
        System.out.println("Total Likes are "+totalLikes);



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
