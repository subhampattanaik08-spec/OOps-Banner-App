import java.util.LinkedHashMap;
import java.util.Map;

public class uc8 {

    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new LinkedHashMap<>();

        map.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
 
        map.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        map.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        return map;
    }

    public static void renderBanner(String word) {
        Map<Character, String[]> patternMap = buildPatternMap();
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("  ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}