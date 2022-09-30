public class ProblemSet2 {
    
    public static void main(String[] args) throws Exception{

        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if(!isSnowing && isRaining && temperature!=50.0){ 
            System.out.println("Let's Stay Home.");
        }else{
            System.out.println("Let's Go Out.");
        }

        /////////////////////////////////////////////////////////////

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

        int weekday = 5;
        boolean holiday = false;

        if(weekday >=1 && weekday <= 5 && !holiday){
            System.out.println("WakeUp at 7:00 Am");
        }else{
            System.out.println("Sleep in!");
        }

        ////////////////////////////////////////////////////////////

        double playbackPosition = 120;
        boolean rewinding = true;
        double rewindAmount = 0;

        if (rewinding) {
             rewindAmount = 0.1;
        }
        playbackPosition = playbackPosition - rewindAmount;
        System.out.println(playbackPosition);

        ///////////////////////////////////////////////////////////

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


    }
  

}
