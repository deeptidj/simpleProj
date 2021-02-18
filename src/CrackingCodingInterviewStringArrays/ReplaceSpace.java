package CrackingCodingInterviewStringArrays;

public class ReplaceSpace {
    /*
        Write a method to replace all spaces in a string with ‘%20’

     */

    public static void main(String[] args) {
        String s = "h ello";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String t) {
        String norm = t.trim().toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (char c :
                norm.toCharArray()) {
            if(c==' ') {
                sb.append("%20");
            }else sb.append(c);
        }
        return sb.toString();

    }
}
