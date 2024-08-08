public class CastExamples {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        long longVal2 = 54737352523244324L;

        short rez1= byteVal;

        // byte -> short -> int ->long
        //  float -> double

        short rez2 = (short) longVal;
        short rez3 = (short) longVal2;
        System.out.println("Rez3: " + rez3);

        long rez4 = (long) (longVal - floatVal);
        System.out.println("Rez4: " + rez4);

        int a = 2;
        int b = 3;
        int c = 4;

       // a += b;//System.out.println(a);
       // a+= b*2;
       // a += c * b - 5;
       // System.out.println("a=" + a);

      //  a*= c * 2 +2; //12 +2 = 14*4 = 56 !!!!!!
       // System.out.println("a=" + a);

      // b *= a-- + ++c *2; -> 33


    }
}
