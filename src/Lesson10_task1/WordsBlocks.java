package Lesson10_task1;

import java.util.Scanner;

public class WordsBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passport = sc.nextLine();

        //String passport = "3333-ppp-4444-lll-1p2l";
        Value.printTwoBlocks(passport);
        Value.changeCharToStar(passport);
        Value.addSlash(passport);
        Value.printLetters(passport);
        Value.checkAbc(passport);
        Value.checkStart(passport);
        Value.checkEnd(passport);



    }
}


















        /*String str1 = str.substring(0, 5) + "***";
        System.out.println(str1);
        String str2 = str.replace("4", "1");
        System.out.println(str2);
        str2.indexOf(1, 2);
        System.out.println(str2);

        String privet = "ignatVika";
        int s1 = privet.indexOf("p", 0);
        boolean c2 = privet.startsWith("gn", 1);
        boolean c3 = privet.endsWith("ik");
        System.out.println(c3);

        String s4 = "          Ignat    debil         ";

        String s2 = "Jopa";
        String s3 = privet.substring(0, 3);
        String s5 = privet.replace('i', 'S');
        String s6 = privet.replace("ignat", "lent9i");
        System.out.println(s6);

        String s7 = "privet";
        String s8 = "drug";
        System.out.println(s7.concat(s8));


        int z1 = 3;
        int z2 = 11;
        String z3 = "Java";

        System.out.println("" + z1 + z2 + z3);




    }
} */
