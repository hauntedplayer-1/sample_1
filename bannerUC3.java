public class OOPSBannerUC3 {

    public static void main(String[] args) {

        printLine(" OOOO ", "  OOOO ", "  PPPP ", "   SSSS ");
        printLine("O    O", " O    O", " P    P", " S      ");
        printLine("O    O", " O    O", " PPPP  ", "   SSS  ");
        printLine("O    O", " O    O", " P      ", "      S ");
        printLine(" OOOO ", "  OOOO ", " P      ", " SSSS   ");

    }

    
    static void printLine(String part1, String part2, String part3, String part4) {

        String line = String.join("   ", part1, part2, part3, part4);
        System.out.println(line);

    }
}
