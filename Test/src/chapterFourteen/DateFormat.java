package chapterFourteen;

public class DateFormat {
    public String convertDate(String date) {
        if(validateDate(date)){

        }
    }

    private boolean validateDate(String date) {
        return date.matches("(\\d\\d|\\d)/(\\d\\d|\\d)/(\\d\\d\\d\\d|\\d\\d)");
    }

    private String [] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };


}
