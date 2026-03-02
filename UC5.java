public class UC5Banner {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", "WELCOME", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "TO", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "JAVA", " ", "BANNER", " ", " ", "*"),
            String.join("", "*", " ", " ", "USE CASE 5", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "OPTIMIZED", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}