public class UC6Banner {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + "  " + p[i] + "  " + s[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Letter P
    public static String[] buildP() {
        return new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Letter S
    public static String[] buildS() {
        return new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        };
    }
}