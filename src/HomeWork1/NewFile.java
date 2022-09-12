package HomeWork1;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        File file = new File(path);

        FileReader fileReader = new FileReader(file);

        int c;
        while((c = fileReader.read()) != -1) {
            System.out.print((char)c);

        }
    }
    }




