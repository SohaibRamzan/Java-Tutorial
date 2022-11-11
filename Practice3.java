public class Practice3 {

    public static int rollingDice(int sides){
        
        // Random numbers between zero and one
        double randomNumber = Math.random();

        // To get value starts with non-zero almost upto 6        
        randomNumber = randomNumber * sides;

        // To get value upto almost 7 numbers
        randomNumber += 1;

        // type-Casting for changing varibale type
        int randomNumberInt = (int) randomNumber;

        return randomNumberInt;

    }

    public static void main(String[] args) throws Exception{
        //Here we get random numbers on every call of function

        int roll3 = rollingDice(3);
        int roll6 = rollingDice(6);
        int roll9 = rollingDice(9);




        System.out.println("three sides = "+roll3);
        System.out.println("six sides = "+roll6);
        System.out.println("nine sides = "+roll9);

    }

}