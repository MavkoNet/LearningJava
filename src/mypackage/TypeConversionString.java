package mypackage;

public class TypeConversionString {

    public static void main(String[] args) {

        //Из строки в число

        //String to byte
        byte strToByte = Byte.parseByte("127");
        System.out.println("String to byte: " + strToByte);


        //String to short
        System.out.println("String to short: " + Short.parseShort("32767"));


        //String to int
        try {

            String str1 = " 2147483647 ";
            int strToInt = Integer.parseInt(str1.trim());
            System.out.println("String to int: " + strToInt);

        } catch (NumberFormatException nfe) {
            System.out.println("String to int: NumberFormatException: " + nfe.getMessage());
        }


        //String to long
        try {

            String str2 = "922337203685477580o7 ";
            long strToLong = new Long(str2.trim());
            System.out.println("String to long: " + strToLong);

        } catch (NumberFormatException e) {
            System.out.println("String to long: NumberFormatException: " + e.getMessage());
        }


        //String to float
        try {

            String str3 = "2876.1087";
            float strToFloat = Float.parseFloat(str3.trim());
            System.out.println("String to float: " + strToFloat);

        } catch (NumberFormatException e) {
            System.out.println("String to float: NumberFormatException " + e.getMessage());
        }


        //String to double
        try {

            String str4 = "896754387.0832709";
            Double strToDouble = new Double(str4.trim());
            System.out.println("String to double: " + strToDouble);

        } catch (NumberFormatException nfe) {
            System.out.println("String to double: NumberFormatException " + nfe.getMessage());
        }

        System.out.println();

        //String to boolean
        String str1 = "True";
        String str2 = "False";
        String other = "Tram-pam-pam";

        boolean boo1 = Boolean.parseBoolean(str1);
        System.out.println("Результат преобразования строки \"" + str1 + "\" в логическую переменную: " + boo1);

        boolean boo2 = Boolean.parseBoolean(str2);
        System.out.println("Результат преобразования строки \"" + str2 + "\" в логическую переменную: " + boo2);

        boolean boo3 = Boolean.parseBoolean(other);
        System.out.println("Результат преобразования строки \"" + other + "\" в логическую переменную: " + boo3);

        System.out.println();


        //Из числа в строку:

        //int to String
        int i = 290987;
        String intToStr = Integer.toString(i);
        System.out.println("int to String: " + intToStr);


        //double to String
        double d = 8972.36276785;
        String doubleToStr = Double.toString(d);
        System.out.println("double to String: " + doubleToStr);


        //long to String
        long l = 8787643876L;
        String longToStr = Long.toString(l);
        System.out.println("long to String: " + longToStr);


        //float to String
        float f = 89347.009089F;
        String floatToStr = Float.toString(f);
        System.out.println("float to String: " + floatToStr);
        System.out.println();

        //Преобразование символа char:
        //char to String
        char ch = 'R';
        String charToStr = Character.toString(ch);
        System.out.println("char to String: " + charToStr);


        //char[] to String
        char[]charArrays = new char[]{'A', 'B', 'C', 'D', 'E'};

        String newString1 = new String(charArrays);
        System.out.println("Character array to String: " + newString1);

    }
}
