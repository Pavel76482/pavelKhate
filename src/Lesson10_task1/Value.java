package Lesson10_task1;


// xxxx-yyy-xxxx-yyy-xyxy

public class Value {

    public static void printTwoBlocks(String passport) {
        System.out.println(passport.substring(0, 4));
        System.out.println(passport.substring(9, 13));
    }

    public static void changeCharToStar(String passport) {
        char[] result = passport.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (i > 4 && i <= 7) {
                result[i] = '*';
            } else if (i > 13 && i <= 16) {
                result[i] = '*';
            }
        }
        System.out.println(result);
    }

    public static void addSlash(String passport) {
        String result2 = "";
        StringBuilder nString = new StringBuilder();
        char[] result = passport.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (i > 4 && i <= 6) {
                result2 = result2 + result[i];
                nString.append(result[i]);
            } else if (i == 7) {
                result2 = result2 + result[i];
                nString.append(result[i]);
            } else if (i > 13 && i <= 15) {
                result2 = result2 + result[i];
                nString.append(result[i]);
            } else if (i == 16) {
                result2 = result2 + result[i];
                nString.append(result[i]).append("/");
            } else if (i == 19) {
                result2 = result2 + result[i] + "/";
                nString.append(result[i]).append("/");
            } else if (i == 21) {
                result2 = result2 + result[i] + "/";
                nString.append(result[i]).append("/");
            }
        }
        System.out.println(nString);
    }

    public static void printLetters(String passport) {
        StringBuilder hightRegister = new StringBuilder("Letters: ");
        String result3 = "";

        char[] result = passport.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (i > 4 && i <= 6) {
                result3 = result3 + result[i];

            } else if (i == 7) {
                result3 = result3 + result[i];

            } else if (i > 13 && i <= 15) {
                result3 = result3 + result[i];

            } else if (i == 16) {
                result3 = result3 + result[i] + "/";

            } else if (i == 19) {
                result3 = result3 + result[i] + "/";

            } else if (i == 21) {
                result3 = result3 + result[i] + "/";
            }
        }
        System.out.println(hightRegister.append(result3.toUpperCase()));
    }

    public static void checkAbc(String passport) {

        boolean contains = passport.contains("ABC");
        boolean contains2 = passport.contains("abc");
        if (contains || contains2) {
            System.out.println("String " + passport + " contains abc");
        } else {
            System.out.println("String " + passport + " not contains");
        }
    }

    public static void checkStart(String passport) {
        System.out.println(passport.startsWith("555", 1));
    }

    public static void checkEnd(String passport) {
        System.out.println(passport.endsWith("1a2b"));
    }
}


