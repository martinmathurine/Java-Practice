import javax.swing.JOptionPane;
class Ex6_2
{
public static void main(String args[])
  {

    int counter=0;
    double percentagemarks=0;
    double total=0;
    //counter = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));    
    while (	percentagemarks !=-1)
    {
  	percentagemarks= Double.parseDouble(JOptionPane.showInputDialog("Enter any number \n -1 to stop"));
  	total = total + percentagemarks;
    counter = counter +1;
    
    System.out.println ("total is   " + total);
    
    }
    double average =total/ counter;
    System.out.println ("   Here is your percentage mark: " + average);
    System.exit(0);
  }
}