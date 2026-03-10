import java.util.HashMap;
import java.util.Map;

public class uc10 {

    // Centralized character pattern storage
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // ===============================
    // Load Character Patterns
    // ===============================
    private static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    // ===============================
    // Render Banner Function
    // ===============================
    private static void renderBanner(String text) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("        "); // space for unknown chars
                }
            }

            System.out.println(line);
        }
    }

    // ===============================
    // Main Method
    // ===============================
    public static void main(String[] args) {

        loadPatterns();        // initialize map
        renderBanner("OOPS");  // render word
    }
}