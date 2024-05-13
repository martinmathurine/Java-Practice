import javax.swing.JOptionPane;
class Ex6_3
{
public static void main(String args[]) 
  {
    final int SENTINEL=0;
    int latestNum;
    int total=0; 
    int counter = 0;
    String numStr;
    JOptionPane.showMessageDialog(null, "Enter 10 positive numbers, \n press 0 to stop:");

    numStr = JOptionPane.showInputDialog("First number? ");
    // Conver from String to int
    latestNum = Integer.parseInt(numStr);
    while (counter!=10)
    {
    	total = total + latestNum;
    	counter++;
    	numStr = JOptionPane.showInputDialog("Next Number?");
    	latestNum = Integer.parseInt(numStr);
    	if(latestNum>101)
    	{
    		numStr = JOptionPane.showInputDialog("Next Number?");
    	    latestNum = Integer.parseInt(numStr);
    	}
    }
    int Average = total/counter;
    JOptionPane.showMessageDialog(null, "Average is " + Average);
  }
}