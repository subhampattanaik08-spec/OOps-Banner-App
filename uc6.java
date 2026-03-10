public class uc6 {

    public static String[] getPatternO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    } 

    public static String[] getPatternP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    public static String[] getPatternS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {
        String[] o1 = getPatternO();
        String[] o2 = getPatternO();
        String[] p  = getPatternP();
        String[] s  = getPatternS();

        for (int i = 0; i < 5; i++) {
            System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}