public class ProblemSet2 {

    public static void heading(int headNum){

        System.out.println("************ "+headNum+" ************");
        
    }

    public static double makeChange(double itemCost, double dollarsProvided){
    
        double change = dollarsProvided - itemCost;
        
        return change;
        
    }

    public static double absoluteValue(double param){

        if(param<0){
            double negatedParam = Math.abs(param);
            return negatedParam;
        }else{
            return param;
        }

    }

    public static double calculateTip(double mealPrice){

        double percentage = (mealPrice*15)/100;
        return percentage;
    }

    public static String nameTagText(String name){

        String tag = "Hello! My name is "+ name;
        return tag;
    }

    public static double fahrenheitToCelsius(double getTempInF){

        // Formula for converting Farenheit to Celcius
        double giveTempInC = (getTempInF-32)*(0.56);
        return giveTempInC;
    }

    public static void printTemperature(double farenheit){

        double tempInC = fahrenheitToCelsius(farenheit);
        System.out.println("F : "+farenheit);
        System.out.println("C : "+tempInC);
    }

    // static int finalSum=0;
     static int totalSum = 0;
    // static int againTotal=0;

    // public static void sameSum(int totalSum){

        
    // }

    public static int num1(){

        double randomNum =  Math.random();
        randomNum = randomNum*6;        
        randomNum += 1;
        int randomNum1 = (int) randomNum;

        return randomNum1;
    }

    public static int num2(){

        double randomNum = Math.random();
        randomNum = randomNum*6;        
        randomNum += 1;
        int randomNum2 = (int) randomNum;

        return randomNum2;
    }


    public static void monoPolyRoll(){

        int Num1 = num1();
        int Num2 = num2();

        if(Num1 == Num2){
            System.out.println("Your Numbers are same "+Num1+" "+Num2);
            int sameSum=Num1+Num2;
            totalSum = totalSum+ sameSum;
            //againTotal+=total;
            //sameSum(againTotal);
            monoPolyRoll();
        }else{
            int n1 = Num1,n2 = Num2;
            
            int sum = n1+n2;
            int finalSum = totalSum + sum;
            System.out.println("You have two different Numbers  "+n1+" "+n2);
            System.out.println("The Total sum of numbers is = "+finalSum);
        }
                
    }

    

    //*********************************************************************************************************************************** */
    
    public static void main(String[] args) throws Exception{

        heading(1);
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if(!isSnowing && isRaining && temperature!=50.0){ 
            System.out.println("Let's Stay Home.");
        }else{
            System.out.println("Let's Go Out.");
        }

        /////////////////////////////////////////////////////////////

        heading(2);
        int time=18;
        String TimeOfDay;

        if(time >= 5 && time<12){
            TimeOfDay = "Morning";
        }else if(time >=12 && time<20){
            TimeOfDay = "DayTime";
        }else{
            TimeOfDay = "NightTime";
        }
        System.out.println(TimeOfDay);

        /////////////////////////////////////////////////////////////

        heading(3);
        int weekday = 5;
        boolean holiday = false;

        if(weekday >=1 && weekday <= 5 && !holiday){
            System.out.println("WakeUp at 7:00 Am");
        }else{
            System.out.println("Sleep in!");
        }

        ////////////////////////////////////////////////////////////

        heading(4);
        double playbackPosition = 120;
        boolean rewinding = true;
        double rewindAmount = 0;

        if (rewinding) {
             rewindAmount = 0.1;
        }
        playbackPosition = playbackPosition - rewindAmount;
        System.out.println(playbackPosition);

        ///////////////////////////////////////////////////////////

        heading(5);
        int dayOfWeek = 3;
        String schedule;

        switch(dayOfWeek){
            case 1: schedule = "Gym in the Morning";
            break;
            case 2: schedule = "Class after work";
            break;
            case 3: schedule = "Meetings all Day";
            break;
            case 4: schedule = "Work from home";
            break;
            case 5: schedule = "Game night after work";
            break;
            default: schedule = "Free";
        }
            System.out.println(schedule);

        /////////////////////////////////////////////////////////

        heading(6);        
        double totalChange = makeChange(10.55, 15);
        int totalChangeInt = (int) totalChange;  /// this is called casting in which a variable type changed to another
        System.out.println("Total Change = "+totalChangeInt);
        
        /////////////////////////////////////////////////////////

        heading(7);
        int neg4 = (int)absoluteValue(-4);
        System.out.println("Negative Four = "+neg4);

        int pos4 = (int)absoluteValue(4);
        System.out.println("Positive Four = "+pos4);

        /////////////////////////////////////////////////////////

        heading(8);
        double percent1 = calculateTip(100);
        System.out.println("15 percent of 100 = "+percent1+"%");

        double percent2 = calculateTip(350);
        System.out.println("15 percent of 350 = "+percent2+"%");

        double percent3 = calculateTip(900);
        System.out.println("15 percent of 900 = "+percent3+"%");

        /////////////////////////////////////////////////////////

        heading(9);
        String name1 = nameTagText("Sohaib Ramzan");
        String name2 = nameTagText("Usman Bashir");
        String name3 = nameTagText("Nouman Saeed");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        /////////////////////////////////////////////////////////

        heading(10);

        printTemperature(89);
        printTemperature(67);
        printTemperature(36);

        /////////////////////////////////////////////////////////

        heading(11);
        monoPolyRoll();
        monoPolyRoll();
        // monoPolyRoll();

    }
  

}
