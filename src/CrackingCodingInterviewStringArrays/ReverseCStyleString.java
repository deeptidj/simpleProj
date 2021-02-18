package CrackingCodingInterviewStringArrays;

public class ReverseCStyleString {
    /*
    Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters, including the null character.)
     */
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s);
        String res = s.isEmpty() ? res = "" :reverse(s.trim().toLowerCase());
        System.out.println(res);

        s = "";
        System.out.println(s);
        res = s.isEmpty() ? res = "" :reverse(s.trim().toLowerCase());
        System.out.println(res);


         s = "abcdABCD";
        System.out.println(s);
         res = s.isEmpty() ? res = "" :reverse(s.trim().toLowerCase());
        System.out.println(res);


        s = "madam!@#";
        System.out.println(s);
        res = s.isEmpty() ? res = "" :reverse(s.trim().toLowerCase());
        System.out.println(res);


         s = "fgsdofgjdfogjdfjkdfksdlfmsdlfmdsflsdflmsdflsdmfdslfmsdlfmsdlfmsdlflsdfmlsdmflsdmflsdfmldsmfldsfmsldmflsdmflsdfmlsdfmlsdmlfmsldmf" +
                 "skjfksdfnsdkfndksfndksnfksdnfsdknfsdnfksdnfksdnfksdnfksadnfasdnfkasdnfksdnfdsfaksdfnskadnfasdkfs" +
                 "sdf'sadfnasdfhasdkfnsadkfnasdkfnasdofhiwefreiwofknwioawenfewaifkaselkfjasdif;jasdfjsado;ifjaskldf" +
                 "sadfasdfhasdkfhasidfhlyasuidfhsadiufhsadiufhsadlifudshfilasdyhfiulsdyfhasildufhyasdilufyhasdlifhasdkjf," +
                 "asdfjasidhfasldifhsadilfuahsdfiuasdhkfnasiufhaweilufhaweaciweohlcaiowekcjnaweh";
        System.out.println(s);
         res = s.isEmpty() ? res = "" :reverse(s.trim().toLowerCase());
        System.out.println(res);

         s = "reverse";
        System.out.println(s);
         res = s.isEmpty() ? res = "" :reverse(s.trim().toLowerCase());
        System.out.println(res);
    }
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        sb.append('\0');
        return sb.toString();
    }
}
