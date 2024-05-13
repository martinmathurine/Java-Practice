import javax.swing.JOptionPane;
class Demo8
{     
  public static void main(String[] args)
  {
    int length = 53;
    int height = 423;
    int width = 23;
    int area = length*height+width;
    String op;      
    op = " length: " + length + '\n' +
         " height: " + height + '\n' + 
         "  width: " + width + '\n' +          	
         "   area: " + area + '\n';   
    JOptionPane.showMessageDialog(null, op);
    System.out.println(op);
    System.exit(0);
  }
} 
