10.18.112.159import javax.swing.JOptionPane;
class Ex5_1
{
	public static void main (String[] args)
	{
		Double mrk = Double.parseDouble(JOptionPane.showInputDialog("Enter exam mark: "));
	
		if (mrk >= 80){
			System.out.println("Here is your grade... A");
		} 
		else if (mrk >= 60){
			System.out.println("Here is your grade... B");
		}  
		else if (mrk >= 40){
			System.out.println("Here is your grade... C");
		}  			
		else if (mrk <= 40){
			System.out.println("Here is your grade... Fail");
		}  	
		System.exit(0);
	}
}