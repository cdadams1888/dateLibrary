public class DateConverter {
    public String monthConverted;
    public int daysInMonth;

    public DateConverter(int birthMonth) {
        int month = birthMonth;
    }

    public DateConverter(int birthMonth, int birthDay, int birthYear) {
        // Taking in birthDay and birthYear, just in case we need formatting for them in the future.
        int month = birthMonth;
        int day = birthDay;
        int year = birthYear;
    }

    public String intMonthToString(int month) {
        switch(month) {
            // Months may actually start at 0, so check into this..
            case 1: monthConverted = "January";
                    break;
            case 2: monthConverted = "February";
                    break;
            case 3: monthConverted = "March";
                    break;
            case 4: monthConverted = "April";
                    break;
            case 5: monthConverted = "May";
                    break;
            case 6: monthConverted = "June";
                    break;
            case 7: monthConverted = "July";
                    break;
            case 8: monthConverted = "August";
                    break;
            case 9: monthConverted = "September";
                    break;
            case 10: monthConverted = "October";
                    break;
            case 11: monthConverted = "November";
                    break;
            case 12: monthConverted = "December";
                    break;
            default: monthConverted = "0";
                    break;

        }
        //TODO: PUT TRY / CATCH to check if "0" here..
        return monthConverted;
    }

    public int getDaysInMonth(int month) {
        switch(month) {

            case 1: daysInMonth = 31;
                    break;
            // Can actually sometimes be 29 on leap year, so user is shit out of luck, but overall this will be a pretty spot on estimate with a standard deviation of + - 1 day.
            case 2: daysInMonth = 28;
                    break;
            case 3: daysInMonth = 31;
                    break;
            case 4: daysInMonth = 30;
                    break;
            case 5: daysInMonth = 31;
                    break;
            case 6: daysInMonth = 30;
                    break;
            case 7: daysInMonth = 31;
                    break;
            case 8: daysInMonth = 31;
                    break;
            case 9: daysInMonth = 30;
                    break;
            case 10: daysInMonth = 31;
                    break;
            case 11: daysInMonth = 30;
                    break;
            case 12: daysInMonth = 31;
                    break;
            default: daysInMonth = 0;
                    break;
        }
        return daysInMonth;
    }

   public String shortMonthToFull(String month) {
        switch(month) {
            case "Jan": monthConverted = "January";
                        break;
            case "Feb": monthConverted = "February";
                        break;
            case "Mar": monthConverted = "March";
                        break;
            case "Apr": monthConverted = "April";
                        break;
            case "May": monthConverted = "May";
                        break;
            case "Jun": monthConverted = "June";
                        break;
            case "Jul": monthConverted = "July";
                        break;
            case "Aug": monthConverted = "August";
                        break;
            case "Sep": monthConverted = "September";
                        break;
            case "Oct": monthConverted = "October";
                        break;
            case "Nov": monthConverted = "November";
                        break;
            case "Dec": monthConverted = "December";
                        break;
            default: monthConverted = "0";
                        break;
        }
        return monthConverted;
   }

}




