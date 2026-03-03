import java.util.*;
public class BannerApp {
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        // Getter for character
        public char getCharacter() {
            return character;
        }
        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void printBanner(String text,
                                   Map<Character, CharacterPatternMap> map) {
        StringBuilder[] bannerLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }
        // Build banner
        for (char ch : text.toCharArray()) {
            CharacterPatternMap cp = map.get(ch);
            if (cp != null) {
                String[] pattern = cp.getPattern();
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }
        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

       
        CharacterPatternMap oPattern =
                new CharacterPatternMap('O', O);

        CharacterPatternMap pPattern =
                new CharacterPatternMap('P', P);

        CharacterPatternMap sPattern =
                new CharacterPatternMap('S', S);

        // Store in Map
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();
        patternMap.put('O', oPattern);
        patternMap.put('P', pPattern);
        patternMap.put('S', sPattern);

        // Display Banner
        printBanner("OOPS", patternMap);
    }
}