import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {
    
    // Centralized HashMap to link individual characters to their multi-line patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();
    private static final int PATTERN_HEIGHT = 5;

    // Initialize the map with character patterns
    static {
        patternMap.put('O', new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        });

        patternMap.put('P', new String[]{
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        });

        patternMap.put('S', new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        });
    }

    public static void main(String[] args) {
        String targetWord = "OOPS";
        System.out.println("Rendering banner for: " + targetWord + "\n");
        renderBanner(targetWord);
    }

    /**
     * Retrieves patterns from the map and uses a StringBuilder 
     * within nested loops to assemble the banner.
     */
    private static void renderBanner(String word) {
        // Outer loop iterates through each row height
        for (int rowIndex = 0; rowIndex < PATTERN_HEIGHT; rowIndex++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            // Inner loop iterates through each character in the word
            for (char c : word.toUpperCase().toCharArray()) {
                String[] pattern = patternMap.get(c);
                
                if (pattern != null) {
                    // Append the specific row of the character's pattern
                    rowBuilder.append(pattern[rowIndex]).append("   "); 
                } else {
                    // Fallback for characters not in the map
                    rowBuilder.append("     ").append("   ");
                }
            }
            
            // Print the fully assembled row to the console
            System.out.println(rowBuilder.toString());
        }
    }
}