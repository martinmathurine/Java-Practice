import javax.swing.JOptionPane;
class Ex3_5
{
  public static void main(String[] args)
  {
    String number1 = JOptionPane.showInputDialog(" Enter 1st number");
    int num1 = Integer.parseInt(number1);
    String number2 = JOptionPane.showInputDialog(" Enter 2nd number");
    int num2 = Integer.parseInt(number2);
	int add, sub, mult, div, mod;
	add = num1 + num2;
	sub = num1 - num2;
	mult = num1 * num2;
	div = num1 / num2;
    System.out.println("add " + add);
    System.out.println("sub " + sub);
    System.out.println("mult " + mult);
    System.out.println("div " + div);
    System.exit(0);
  }
} 
