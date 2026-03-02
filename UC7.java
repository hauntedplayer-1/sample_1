import java.util.*;

public class UC7Banner {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPatternMap> patternLibrary = initializePatterns();

        String word = "OOPS";
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder rowBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap cp : patternLibrary) {
                    if (cp.getCharacter() == ch) {
                        rowBuilder.append(cp.getPattern()[i]).append("  ");
                    }
                }
            }

            banner[i] = rowBuilder.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    private static List<CharacterPatternMap> initializePatterns() {

        List<CharacterPatternMap> patterns = new ArrayList<>();

        patterns.add(new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patterns.add(new CharacterPatternMap('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        }));

        patterns.add(new CharacterPatternMap('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        }));

        return patterns;
    }
}