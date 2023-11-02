import java.awt.Graphics;

import javax.swing.JComponent;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {

        int[][] board = new int[][]{{1, -1, 1}, {1, 1, 1}, {-1, -1, -1}};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (board[row][col] > 0) {
                    g.drawLine(col * 10, row * 10, col * 10 + 8, row * 10 + 8);
                    g.drawLine(col * 10, row * 10 + 8, col * 10 + 8, row * 10);
                } else if (board[row][col] < 0) {
                    g.drawOval(col * 10, row * 10, 8, 8);
                }
            }
        }
    }
}