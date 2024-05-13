import javax.swing.JOptionPane;
class Ex4_3
{
	public static void main(String[] args)
	{
		String number1 = JOptionPane.showInputDialog("Enter your 1st number: ");
        int num1 = Integer.parseInt(number1);
		String number2 = JOptionPane.showInputDialog("Enter your 2nd number: ");
        int num2 = Integer.parseInt(number2);
		String number3 = JOptionPane.showInputDialog("Enter your 3rd number: ");
        int num3 = Integer.parseInt(number3);
		int temp = num1;
		num1 = num3;
		num3 = num2;	
		num2 = temp;
		System.out.println("1st Entered Number: " + num1);
		System.out.println("2nd Entered Number: " + num2);
		System.out.println("3rd Entered Number: " + num3);
        System.exit(0);
	}
}