public class Time {

    private int seconds;
    private int minutes;
    private int hours;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.seconds = seconds;
        this.minutes = minutes;
    }


    public int getSeconds() {
        return seconds;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getHours(){
        return hours;
    }


    public void tick(){
        seconds += 1;
        if (seconds >= 60){
            seconds = 0;
            minutes += 1;
        }
        if (minutes >= 60){
            minutes = 0;
            hours += 1;
        }
        if (hours >=24){
            hours = 0;

        }

    }

    public void add(String preTime){


        hours += Integer.parseInt(preTime.substring(0,2));
        minutes += Integer.parseInt(preTime.substring(3,5));
        seconds += Integer.parseInt(preTime.substring(6));


        if (seconds > 59){
            minutes += seconds/60;
            seconds = seconds%60;


        }
        if (minutes > 59){
            hours += minutes/60;
            minutes = minutes%60;
        }
        if (hours > 23){
            if(hours%24 == 0){
                hours = 0;
            }else{
                hours = hours%24;


            }

        }

    }
    public void add(Time preTime){

        hours += preTime.getHours();
        minutes += preTime.getMinutes();
        seconds += preTime.getSeconds();

        if (seconds > 59){
            minutes += seconds/60;
            seconds = seconds%60;

        }
        if (minutes > 59){
            hours += minutes/60;
            minutes = minutes%60;
        }

        if (hours > 23){
            if(hours%24 == 0){
                hours = 0;
            }else{
                hours = hours%24;

            }

        }

    }
    public String info(){
        String hour = "" + hours;
        String minute = ""+ minutes;
        String second = ""+ seconds;
        if(seconds < 10){
            second = 0 + second;
        }
        if(minutes < 10){
            minute = 0 + minute;
        }
        if(hours < 10){
            hour = 0 + hour;
        }
        return hour + ":"+minute+ ":"+second;
    }
}