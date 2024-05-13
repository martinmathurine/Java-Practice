// sum of 3 numbers
import javax.swing.JOptionPane;
class Example2
{
	public static void main (String args[])
	{
		int n = 0;//counter initialisation
		int sum = 0;//initialise sum to 0
		int average;//declare variable
		
	while (n<3)//counter check
	{
	    String str = JOptionPane.showInputDialog("Enter number: ");
		int num = Integer.parseInt(str);//get number from user
		sum = sum + num;//calculate total
		n++;//counter increment 
	}	
		System.out.println(sum + " / " + n);
		average = sum/n;//counter avaerage
		JOptionPane.showMessageDialog(null, "\n Average is... " + average);
	}

}
