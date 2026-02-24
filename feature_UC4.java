public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Creating banner lines using String.join()
        String[] banner = {

                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "O", "O", "P", "S", " ", "A", "P", "P", " ", "*"),
                String.join("", "*", " ", "U", "C", "4", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Printing using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}