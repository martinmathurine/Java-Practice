import javax.swing.JOptionPane;
class Ex6_4
{
public static void main(String args[])
 {
	final int SENTINEL = -1;				// LINE L1
	int latestNum;						// LINE L2
	int total = 0;						// LINE L3
	String str;						// LINE L4

    str = JOptionPane.showInputDialog("First number? ");			// LINE L5
	latestNum = Integer.parseInt(str);		// LINE L6
		

	
	while (latestNum != SENTINEL)			// LINE L7
	{
	     total = total + latestNum;		// LINE L8
         str = JOptionPane.showInputDialog("Next number? ");		// LINE L9
		 latestNum = Integer.parseInt(str);	// LINE L10

	}
	JOptionPane.showMessageDialog(null, "Total is: "+ total);   // LINE L11
 }
}