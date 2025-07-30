public class datatype {
    public static void main(String[] args) {

        //data types and variable declaration
        // if condition
        // int num = 10;
        // if (num > 0) {
        //     System.out.println("The number is positive: " + num);
        // }

        //ternary operator
        // int score = 75;
        // String grade = (score >= 70) ? "A" :
        //                (score >= 60) ? "B" :
        //                (score >= 50) ? "C" : 
        //                (score >= 40) ? "D" : "F";
        // System.out.println("Your grade is: " + grade);

        //switch case option 1
        // int day = 2; // Example day of the week
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");

        // }

        //switch case option 2 by using arrow

        // int day = 5; // Example day of the week
        // String result = "";
        // result = switch (day) {
        //     case 1 -> "Monday";
        //     case 2 -> "Tuesday";
        //     case 3 -> "Wednesday";
        //     case 4 -> "Thursday";
        //     case 5 -> "Friday";
        //     case 6 -> "Saturday";
        //     case 7 -> "sunday";
        //     default ->"Invalid day";
        // };
          
        //  System.out.println(result);

        //switch case option 3 by using arrow with multiple case
        // int day = 5; // Example day of the week
        // String result = "";
        // result = switch (day) {
        //     case 1 -> result = "Monday";
        //     case 2 -> result = "Tuesday";
        //     case 3 -> result = "Wednesday";
        //     case 4 -> result = "Thursday";
        //     case 5 -> result = "Friday";
        //     case 6 -> result = "Saturday";
        //     case 7 -> result = "sunday";
        //     default -> result = "Invalid day";
        // };

        // System.out.println(result);

        //switch case option 4 by using colons
        int day = 5; // Example day of the week
        String result = "";
        result = switch (day) {
            case 1 : yield "Monday";
            case 2 :yield "Tuesday";
            case 3 :yield "Wednesday";
            case 4 :yield "Thursday";
            case 5 :yield "Friday";
            case 6 :yield "Saturday";
            case 7 :yield "sunday";
            default : yield "Invalid day";
        };

        System.out.println(result);

        

    }
    
}
