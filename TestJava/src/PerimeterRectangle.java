import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class PerimeterRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);
		float longueurRectangle, largeurRectangle, perimetreRectangle;
		System.out.println("To calculate the perimeter, please enter the length of the rectangle : ");
		longueurRectangle = sc.nextFloat();
		System.out.println("and now, please enter its width :");
		largeurRectangle = sc.nextFloat();
		perimetreRectangle = (longueurRectangle + largeurRectangle)*2f;
		System.out.println("Length : "+longueurRectangle+"cm \nWidth : "+largeurRectangle+"cm \nPerimeter : "+perimetreRectangle+"cm");
		sc.close();
	}

}
