package CrackingCodingInterviewStringArrays;

public class isRotation {
    /*
    Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings,
    s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
    (i.e., “waterbottle” is a rotation of “erbottlewat”).
     */
    public static void main(String[] args) {
        System.out.println("Is Rotation");
        String s1 = "erbottlewat";
        s1 = null;
        String s2 = "waterbottle";
        s2 = null;
        s1 = s1 + s1;
        if (s1 != null || s2 != null)
        {
            System.out.println("empty strings");
        }

        String str1 = new String() ;
        str1 = null;
        stringChecks(str1);

        str1 = "";
        stringChecks(str1);

        String str2 = new String();
        stringChecks(str2);


        //System.out.println(s2.isSubstring(s1));


    }
    public static void stringChecks(String str1) {
        if (str1 == null) {
            System.out.println("String instance is null");
        }
        else if  (str1.isBlank()) {
            System.out.println("String instance is blank");
        } else if (str1.isEmpty()) {
            System.out.println("String instance is empty");
        }

    }
}
