package oops;
public class UC3 {

public static void main(String[] args) {

        // Each line built using String.join()
        String line1 = String.join(" ", 
                "OOOOO", " ", "OOOOO", " ", "PPPPP", " ", "SSSSS");

        String line2 = String.join(" ",
                "O", "   ", "O", " ", "O", "   ", "O", " ", "P", "   ", "P", " ", "S");

        String line3 = String.join(" ",
                "O", "   ", "O", " ", "O", "   ", "O", " ", "PPPPP", " ", "SSSS");

        String line4 = String.join(" ",
                "O", "   ", "O", " ", "O", "   ", "O", " ", "P", " ", " ", " ", "S");

        String line5 = String.join(" ",
                "OOOOO", " ", "OOOOO", " ", "P", " ", " ", " ", "SSSSS");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}