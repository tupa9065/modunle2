import java.sql.Date;

public class NextDayCalculator {


    public static int nextDay(int day, int month, int year) {
        int nextDay;
        if (day < 28) {
            return day + 1;
        } else if (day == 28) {
            if (year % 4 == 0) {
                return day + 1;
            } else {
                if(month==2){
                    return 1;
                }else {
                    return day +1;
                }

            }
        } else if (day == 29) {
            if (month==2){
                if(year%4==0){
                    return 1;
                }else {
                    return -1;
                }

            }else {
                return day+1;
            }
        }else if (day==30){
            if (month==2){
                return -1;
            }else {
                switch (month){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return day+1;

                }
                return 1;
            }

        }else if(day==31){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 1;

            }
            return -1;

        }else {
            return -1;
        }

    }

}
