import javax.swing.JOptionPane;
class Ex4_1
{
	public static void main(String[] args)
	{
		String number1 = JOptionPane.showInputDialog("Enter your 1st number:");
        int num1 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Enter 2nd number:");
        int num2 = Integer.parseInt(number2);
        int mult;
		mult = num1 * num2;
		System.out.println("mult " + mult);
        System.exit(0);
	}
}