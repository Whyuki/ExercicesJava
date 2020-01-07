import java.util.Scanner;

import com.crm.formation.MethodTest;

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
		float lengthRectangle, widthRectangle, perimeterRectangle;
		System.out.println("To calculate the perimeter, please enter the length of the rectangle : ");
		lengthRectangle = sc.nextFloat();
		System.out.println("and now, please enter its width :");
		widthRectangle = sc.nextFloat();
		perimeterRectangle = MethodTest.perimeterRectangle(lengthRectangle,widthRectangle);
		System.out.println("Length : "+lengthRectangle+"cm \nWidth : "+widthRectangle+"cm \nPerimeter : "+perimeterRectangle+"cm");
		sc.close();
	}

}
