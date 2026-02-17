/**
 * UC4: print OOPS in Banner Format using array
 *
 * @author sai-baibhab
 * @version 1.0
 */
public class UC4printBanner {

    public static void main(String[] args) {
        String[] lines = new String[6];

        // OOPS Banner using array (UC4)
        lines[0] = String.join(" ", "  ***  ", "  ***  ", " ****  ", " ***** ");
        lines[1] = String.join(" ", " *   * ", " *   * ", " *   * ", " *     ");
        lines[2] = String.join(" ", "*     *", "*     *", " ****  ", " ****  ");
        lines[3] = String.join(" ", "*     *", "*     *", " *     ", "     * ");
        lines[4] = String.join(" ", " *   * ", " *   * ", " *     ", " *   * ");
        lines[5] = String.join(" ", "  ***  ", "  ***  ", " *     ", " ***** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
