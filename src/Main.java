
public class Main {
    public static void main(String[] args) {
        String fullString = "Курсы по джава от SkyPro";
        doSubString(fullString);
    }

    private static void doSubString(String fullString) {
        doSubStringToChars(fullString);
        System.out.println();
        doSubStringToWords(fullString);
    }

    //
    private static void doSubStringToWords(String fullString) {
        String[] strings = fullString.split("[^A-zА-я0-9]");
        for (String str :
                strings) {
            System.out.println(str);
        }
    }

    private static void doSubStringToChars(String fullString) {
        char[] strToChar = fullString.toCharArray();
        for (char chars :
                strToChar) {
            if (chars != ' ') {
                System.out.print(chars + " ");
            }
        }
    }
}