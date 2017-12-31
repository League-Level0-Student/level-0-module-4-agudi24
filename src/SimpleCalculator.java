
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			// 1. Get 2 numbers from the user and convert them to integer.
			String n = JOptionPane.showInputDialog(null, "what is your first favorite number");
			String nn = JOptionPane.showInputDialog(null, "what is your second favorite number");
			int n2 = Integer.parseInt(nn);
			int n1 = Integer.parseInt(n);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null,
					"Do you want me to add/subtract/multiply/divide " + n1 + " and " + n2, "Computer Calculator", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "subtract", "add", "multiply", "divide" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.

			if (operation == 1) {
				add(n1, n2);
			} else if (operation == 0) {
				subtract(n1, n2);
			} else if (operation == 3) {
				divide(n1, n2);
			} else if (operation == 2) {
				multiply(n1, n2);
			}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	private static void parseInt(String nn) {
		// TODO Auto-generated method stub

	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int n1, int n2) {
		int n3 = n1 + n2;
		JOptionPane.showMessageDialog(null, n3);
	}

	static void subtract(int n1, int n2) {
		int n3 = n1 - n2;
		JOptionPane.showMessageDialog(null, n3);
	}

	static void multiply(int n1, int n2) {
		int n3 = n1 * n2;
		JOptionPane.showMessageDialog(null, n3);
	}

	static void divide(int n1, int n2) {

		int n3 = n1 / n2;
		JOptionPane.showMessageDialog(null, n3);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
}