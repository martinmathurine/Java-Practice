import javax.swing.JOptionPane;
class Ex4_4
{
	public static void main(String[] args)
	{
		String radius = JOptionPane.showInputDialog("Enter the radius of a circle: ");
        double rad = Double.parseDouble(radius);
        double dia, area, circ;
        double pi;
		dia = 2 * rad;
		pi = 3.14;
		area = pi * rad * rad;
		circ = 2 * pi * rad;
		System.out.println("Radius of Circle: " + rad);
		System.out.println("Diameter of Circle: " + dia);
		System.out.println("Circumference of Circle: " + circ);
		System.out.println("Area of Circle: " + area);
        System.exit(0);
	}
}