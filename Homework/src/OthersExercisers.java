public class OthersExercisers {
    public static void main(String[] args) {
//ex1
        int myAge = 20;
        System.out.println("My age is " + myAge);
        double height = 1.70d;
        System.out.println("My height is " + height + "m");
        char firstLetter = 'R';
        System.out.println("My first letter of my name is " + firstLetter);
    //        boolean isStudent=true;
    //        System.out.println("I am a student: " + isStudent);

//ex2
        int myFriendAge = 22;
        System.out.println("My friend age is " + myFriendAge);
        int addition = myFriendAge + myAge;
        System.out.println("Addition is " + addition);
        int subtraction = myFriendAge - myAge;
        System.out.println("Subtraction is " + subtraction);
        int multiplication = myFriendAge * myAge;
        System.out.println("Multiplication is " + multiplication);
        int division = myFriendAge / myAge;
        System.out.println("Division is " + division);
//ex3
        String myName = "Renata";
        String lastName = "Andrada";
        String fullName = myName + " " + lastName;
        System.out.println("Full name is: " + fullName);
//ex4
        //        double kmToBeius = 18.5d;
        //        double kmToPartyFromBeius = 0.7d;
        //        int subtractionKm= (int) (kmToBeius-kmToPartyFromBeius);
        //        System.out.println("Subtraction Km is " + subtractionKm);
        int myInt = 42;
        double myDouble = myInt;  // Implicit casting: int to double

        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        double myDouble2 = 42.99;
        int myInt2 = (int) myDouble2;  // Explicit casting: double to int

        System.out.println("Double value: " + myDouble2);
        System.out.println("Integer value: " + myInt2);

//ex5
        int lenght = 20;
        int width = 10;
        int area = lenght * width;
        System.out.println("Area is " + area);
//ex6
        int average = (lenght + width + area)/3;
        System.out.println("The average is: " + average);
//ex7
        double weight = 58.2d;
        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
        // Determine the BMI category
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
//ex8
        double radius = 5.0;
        double pi=3.14159265359d;
        //double circleArea=Math.PI * radius * radius;
        double circleArea = pi * radius * radius ;
        System.out.println("Area is " + area);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference is " + circumference);
//ex9
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");


    }
}
