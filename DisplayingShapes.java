public class DisplayingShapes {
    public static void main(String[] args) {
        // Each array holds the lines of one shape
        String[] square = {
            "*********",
            "*       *",
            "*       *",
            "*       *",
            "*********"
        };

        String[] oval = {
            "   ***   ",
            "  *   *  ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *   *  ",
            "   ***   "
        };

        String[] arrow = {
            "   *   ",
            "  ***  ",
            " ***** ",
            "*******",
            "   *   ",
            "   *   ",
            "   *   ",
            "   *   "
        };

        String[] diamond = {
            "    *    ",
            "  *   *  ",
            " *     * ",
            "*       *",
            " *     * ",
            "  *   *  ",
            "    *    "
        };

        // Print them side by side
        int maxLines = Math.max(Math.max(square.length, oval.length),
                                Math.max(arrow.length, diamond.length));

        for (int i = 0; i < maxLines; i++) {
            String sq = (i < square.length) ? square[i] : "         ";
            String ov = (i < oval.length) ? oval[i] : "         ";
            String ar = (i < arrow.length) ? arrow[i] : "       ";
            String di = (i < diamond.length) ? diamond[i] : "       ";

            System.out.println(sq + "   " + ov + "   " + ar + "   " + di);
        }
    }
}
