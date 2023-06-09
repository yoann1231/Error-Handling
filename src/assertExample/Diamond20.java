package assertExample;

import javax.swing.JOptionPane;

class Diamond20 {
    static void printDiamond(int size) {
        StringBuilder diamond = new StringBuilder();

        /* print upper triangle */
        for (int r = 1, a = 1; r <= size; r++, a += 2) {
            /* print spaces */
            for (int i = size - r; i >= 1; i--) {
                diamond.append(" ");
            }
            /* print *'s */
            for (int j = 1; j <= a; j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }

        /* print lower triangle */
        for (int r = size - 1, a = 2 * (size - 1) - 1; r >= 1; r--, a -= 2) {
            /* print spaces */
            for (int i = size - r; i >= 1; i--) {
                diamond.append(" ");
            }
            /* print *'s */
            for (int j = 1; j <= a; j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }

        JOptionPane.showMessageDialog(null, diamond.toString());
        System.out.println(diamond);
    }

    public static void main(String args[]) {
        String strSize;

        // Get the size of the diamond to draw
        strSize = JOptionPane.showInputDialog(null, "Enter diamond size:");
        int size = Integer.parseInt(strSize);

        // Assert that the value entered is less than or equal to 20,
        // otherwise, it will generate AssertionError exception.
        try {
            assert (size <= 20) : "Size should be less than or equal to 20.";
            printDiamond(size);
        } catch (AssertionError e) {
            JOptionPane.showMessageDialog(null, "AssertionError is captured: " + e.getMessage());
        }

        System.exit(0);
    }
}
