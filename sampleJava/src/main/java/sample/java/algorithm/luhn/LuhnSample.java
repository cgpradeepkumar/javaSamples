package sample.java.algorithm.luhn;

/**
 * @author pkumar on 30/11/17
 * @project javaSamples
 */
public class LuhnSample {

    public static void main(String[] args) {

//        Long value = 7207260096080L;
//        Long value = 7709280072082L;
        Long value = 9512205516086L;

        System.out.println("is valid?  = " + validateIDWithLuhn(value));
        System.out.println("is valid? (std) = " + validateWithStandardLuhn(value));
    }

    private static boolean validateIDWithLuhn(Long idNum) {
        String tmpID = "" + idNum;
        if (tmpID == null || tmpID.length() != 13) {
            return false;
        }
        int a = 0, b = 0, c = 0, d = 0, z = 0;
        String tmp = "";
        /*
         * Here we add all the even values and
		 * concatenate all the odd values,
		 * this would be swapped in the
		 * standard luhn algorithm but we start at
		 * 0 which reads better.
		 */
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                a += new Integer("" + tmpID.charAt(i));
            } else {
                tmp += tmpID.charAt(i);
            }
        }
        b = new Integer(tmp);
        tmp = "" + (2 * b);
        for (int i = 0; i < tmp.length(); i++) {
            c += new Integer("" + tmp.charAt(i));
        }
        d = a + c;
        z = 10 - (d % 10);
        return z == (idNum % 10);
    }

    private static boolean validateWithStandardLuhn(Long value) {

        String string = "" + value;
        int length = string.length();
        int a = 0;
        String evens = "";
        String odds = "";
        for (int i = length - 1; i >= 0; i--) {
//            System.out.print(string.charAt(i));
            // calculate sum of odd numbers
            if (i % 2 == 0) {
                odds += string.charAt(i);
                a += new Integer("" + string.charAt(i));
            } else {
                evens += string.charAt(i);
            }
        }
        int b = 0;
        int c = 0;
        for (int i = 0; i < evens.length(); i++) {
            c = new Integer("" + evens.charAt(i));
            int tmp = c * 2;
            if (tmp > 9) {
                tmp = tmp - 9;
            }
            b += tmp;
        }

        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);
        System.out.println("sum of odd numbers = " + a);
        System.out.println("sum of even numbers = " + b);

        int result = a + b;

        return result % 10 == 0;
    }
}
