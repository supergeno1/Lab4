/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * does.
 * something
 */
public class ReclamationProject {
    /**
     * runs the program.
     * If a and b are the same string then it prints the string minus the last letter.
     * if one is shorter/longer than the other then it prints the equal characters
     * @param args runs the program
     */
    public static void main(final String[] args) {
        String a = "yessssssfgbsfgb";
        String b = "yesssss";
        String c = printMostInCommon(a, b);
        System.out.println(c);
    }
    /**
     *
     * @param a you know i had to
     * @param b do it to em
     * @return returns something
     */
    public static String printMostInCommon(String a, String b) {
        //if (a.length() > b.length()) {
          //  String c = a;
            //a = b;
            //b = c;
        //}
        String r = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    r = (a.regionMatches(i, b, k, j) && j > r.length()) ? a.substring(i, i + j) : r;
                }
            }
        }
        return r;
    }
}
