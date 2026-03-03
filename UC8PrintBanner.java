import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    /**
     * Utility method to create character patterns
     */
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        // Pattern for O
        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patterns;
    }

    /**
     * Utility method to print banner text
     */
    public static void printBanner(String message,
                                   Map<Character, String[]> patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // initialize lines
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // build banner using nested loops
        for (char ch : message.toCharArray()) {

            String[] pattern = patterns.get(ch);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        // print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Create patterns using HashMap
        Map<Character, String[]> patterns = createCharacterPatterns();

        // Display banner
        printBanner("OOPS", patterns);
    }
}