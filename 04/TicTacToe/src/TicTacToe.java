import javax.swing.JFrame;

public class TicTacToe {

	public void play() {
		// creating object of JFrame(Window popup)
		JFrame window = new JFrame();

		// setting closing operation
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setting size of the pop window
		window.setBounds(30, 30, 200, 200);

		MyCanvas canv = new MyCanvas();

		// setting canvas for draw
		window.getContentPane().add(new MyCanvas());

		// set visibility
		window.setVisible(true);

	}

}
