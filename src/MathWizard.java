import javax.swing.JOptionPane;

public class MathWizard {
	public static void main(String[] args) {
		while (true) {
			String number = JOptionPane.showInputDialog("What operation (add, subtract, multiply, divide)");
			if (number.equals("exit")) {
				System.exit(0);
			}
			String first = JOptionPane.showInputDialog("What is the first number");
			int num1 = Integer.parseInt(first);
			String second = JOptionPane.showInputDialog("What is the second number");
			int num2 = Integer.parseInt(second);
			if (number.equals("add")) {
				JOptionPane.showMessageDialog(null, Calculator.add(num1, num2));
			} else if (number.equals("subtract")) {
				JOptionPane.showMessageDialog(null, Calculator.subtract(num1, num2));
			} else if (number.equals("multiply")) {
				JOptionPane.showMessageDialog(null, Calculator.multiply(num1, num2));
			} else if (number.equals("divide")) {
				JOptionPane.showMessageDialog(null, Calculator.divide(num1, num2));

			}
		}
	}
}