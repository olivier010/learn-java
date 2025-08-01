class calculator {
    public int add(int num1, int num2) {

        int addition = num1 + num2;
        return addition;
    }

    public int sub(int num1, int num2) {
        int differ = num1 - num2;
        return differ;
    }

    public int div(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }
}

public class objects {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 1;

        calculator calc = new calculator();
        int addition = calc.add(n1, n2);
        System.out.println("The sum of two number is: " + addition);

        //substraction

        int differ = calc.sub(n1, n2);
        System.out.println("the difference of these two number is: " + differ);

        //division
        if (n2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        } else {
            int division = calc.div(n1, n2);
            System.out.println("The division of these two number is: " + division);
            
        }
       
    }
}
