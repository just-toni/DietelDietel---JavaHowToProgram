package chapterFourteen;

public class DateFormat {
    public void convertDate(String date) {
        if(validateDate(date)){
            String[] splitDate = date.split("/");
            int[] date1 = new int[3];
            for (int i = 0; i < splitDate.length; i++) {
                date1[i] = Integer.parseInt(splitDate[i]);
            }
            System.out.println(months[date1[1] - 1] + " " + date1[0] + ", " + date1[2]);
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

    public static void main(String[] args) {
        DateFormat dateFormat = new DateFormat();
        dateFormat.convertDate("24/03/2001");
    }


}
