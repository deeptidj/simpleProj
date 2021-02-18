package com.company;

public class PrimitiveDataTypesEx {
    public static void main(String[] args) {
        byte b0 = -128;
        byte b1 = 127;
        short s1 = -32768;
        short s2 = 32767;

        String s3 = "146.31";
        double d = Double.parseDouble(s3);
        System.out.println(d);

        String s4 = "146";
        int i = Integer.parseInt(s4);
        System.out.println(i);


        float f = Float.parseFloat(s3);
        System.out.println(f);

        var unsigned = Integer.parseUnsignedInt("3000000000");
        System.out.println("Unsigned value is"+unsigned);
        var res = Integer.divideUnsigned(unsigned,2);
        System.out.println("result is:" +res);
    }
}
