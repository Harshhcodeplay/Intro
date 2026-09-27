import java.util.ArrayList;

public class program2{

    public static void main(String[] args) {

  
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Asha");
        studentNames.add("Ravi");
        studentNames.add("Sneha");
        studentNames.add("Kiran");

    
        int[] attendanceDays = {22, 18, 15, 10};
        int[] marks = {88, 55, 95, 38};

        
        System.out.println("--- Enrolled Students (enhanced for loop) ---");

        for (String name : studentNames) {
            System.out.println("Student: " + name);
        }

        
        System.out.println("\n--- break: find first student with poor attendance ---");

        for (int i = 0; i < attendanceDays.length; i++) {

            if (attendanceDays[i] < 15) {
                System.out.println(studentNames.get(i)
                        + " has poor attendance ("
                        + attendanceDays[i]
                        + " days). Stopping search.");
                break;
            }
        }

        
        System.out.println("\n--- continue: list only students who passed (marks >= 70) ---");

        for (int i = 0; i < marks.length; i++) {

            // Skip students who failed
            if (marks[i] < 70) {
                continue;
            }

            System.out.println(studentNames.get(i)
                    + " passed with "
                    + marks[i]
                    + " marks");
        }

        
        System.out.println("\n--- Attendance Status & Grade Report ---");

        for (int i = 0; i < studentNames.size(); i++) {

            String name = studentNames.get(i);
            int days = attendanceDays[i];
            int mark = marks[i];

            // if-else for attendance status
            String attendanceStatus;

            if (days >= 20) {
                attendanceStatus = "Good";
            } else if (days >= 15) {
                attendanceStatus = "Average";
            } else {
                attendanceStatus = "Poor";
            }

            
            char grade;
            int band = mark / 10;

            switch (band) {

                case 10:
                case 9:
                    grade = 'A';
                    break;

                case 8:
                    grade = 'B';
                    break;

                case 7:
                    grade = 'C';
                    break;

                case 6:
                    grade = 'D';
                    break;

                default:
                    grade = 'F';
            }

            System.out.println(name
                    + " - Attendance: " + attendanceStatus
                    + " (" + days + " days), Grade: " + grade);
        }

        
        System.out.println("\n--- while loop: running total of marks until 200 ---");

        int total = 0;
        int idx = 0;

        while (idx < marks.length && total < 200) {

            total += marks[idx];
            idx++;
        }

        System.out.println("Stopped at index " + idx
                + ", running total = " + total);

    
        System.out.println("\n--- do-while loop: countdown to result announcement ---");

        int countdown = 3;

        do {
            System.out.println(countdown + "...");
            countdown--;
        } while (countdown > 0);

        System.out.println("Result Announced!");
    }
}