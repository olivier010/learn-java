public class datatype {
    public static void main(String[] args) {

        //data types and variable declaration
        // if condition
        // int num = 10;
        // if (num > 0) {
        //     System.out.println("The number is positive: " + num);
        // }

        //ternary operator
        int score = 75;
        String grade = (score >= 70) ? "A" :
                       (score >= 60) ? "B" :
                       (score >= 50) ? "C" : 
                       (score >= 40) ? "D" : "F";
        System.out.println("Your grade is: " + grade);


    }
    
}
