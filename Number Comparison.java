import javax.swing.JOptionPane;
class Ex5_3
{
	public static void main (String[] args)
	{
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
		
		if (number1 >= number2){
        System.out.println(number1 );
		}
	    else if (number1 < number2){
		System.out.println(number2);
	    }
	    

	
	
	
	
	
	
	    
		System.exit(0);
	}
}
