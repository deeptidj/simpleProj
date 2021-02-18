public class UdemySamples {
    public static byte deepansh1;
    public static short deepansh2;
    public static int deepansh3;
    public static long deepansh4;
    public static float deepansh5;
    public static double deepansh6;
    public static char deepansh7;
    public static boolean deepansh8;


    public static void main(String[] args) {
//        float f = 12.0f;
//        char c = 65;
//        System.out.println(c);
//        for (int i = 65; i < 140; i++) {
//            c = (char) i;
//            System.out.println(i+" "+c);
//        }
        //65 to 90 capital A-Z
        //97 to 122 small a-z//prints the default values {needs to be declared at the class variables and not local variables}
        System.out.println(deepansh1);
        System.out.println(deepansh2);
        System.out.println(deepansh3);
        System.out.println(deepansh4);
        System.out.println(deepansh5);
        System.out.println(deepansh6);
        int i = deepansh7;
        System.out.println(deepansh7+ " "+i);
        System.out.println(deepansh8);

    String s1 = "literals";
    String s2 = "literals";
    String so1 = new String("Hello");
    String so2 = new String("Hello");

        if (s1 == s2) System.out.println("Literals are equal ? ");
        if (so1.equals(so2)) System.out.println(" Object are equal by equal");
       if (so1 == so2) System.out.println("Can objects references be equal?");
    }
}