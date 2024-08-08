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
    }
}
