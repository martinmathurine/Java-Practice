import javax.swing.JOptionPane;
class Ex4_2
{
	public static void main(String[] args)
	{
		String number1 = JOptionPane.showInputDialog("Enter your 1st number:");
        int num1 = Integer.parseInt(number1);
        int sqr, cube;
		sqr = num1 * num1;
		cube = num1 * sqr;
		System.out.println("You Entered Number: " + num1);
		System.out.println("Squared: " + sqr);
		System.out.println("Cubed: " + cube);
        System.exit(0);
	}
}