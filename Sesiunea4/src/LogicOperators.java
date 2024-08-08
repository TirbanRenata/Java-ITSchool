public class LogicOperators {
    public static void main(String[] args) {

        boolean boolVal = false;
        System.out.println("boolVal = " + boolVal) ;
        System.out.println(!boolVal);

        // val =  bool exp ? rez adevarat : rez neg;

        int a= !(3<5) ? 4: 5 ;

        String name = "Renata";
        int age = name.equals("Renata") ? 20 : 30;
        System.out.println("Renata has " + age + " years old");

       // if(3<5)
       // System.out.println("First number is less than second number");
       // else
       // System.out.println("Second number is less than first number");
        int valA = 3;
        int valB = 5;
        if(valA<valB)
            System.out.println("First number is less than second number");
        else if(valB>valA)
            System.out.println("Second number is less than first number");
        else
            System.out.println("Numbers are equals");



    }
}
