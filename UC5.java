public class UC5 {
    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] lines = {

                String.join(" ",
                        " ***  ", " ***  ", " ***** ", " ***** "),

                String.join(" ",
                        "*   * ", "*   * ", "*    *", "*     "),

                String.join(" ",
                        "*   * ", "*   * ", "*    *", "*     "),

                String.join(" ",
                        "*   * ", "*   * ", "***** ", " ***** "),

                String.join(" ",
                        "*   * ", "*   * ", "*      ", "     *"),

                String.join(" ",
                        "*   * ", "*   * ", "*      ", "     *"),

                String.join(" ",
                        " ***  ", " ***  ", "*      ", " ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
