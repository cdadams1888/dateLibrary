public class DateConverter {
    public String monthConverted;

    public DateConverter(int birthMonth, int birthDay, int birthYear) {
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
            default: monthConverted = null;
                    break;

        }
        return monthConverted;
    }
}



