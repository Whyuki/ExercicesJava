import java.util.Scanner;

import com.crm.api.Utils;

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

		String str = "Hello !";
		Utils.afficherMessage(str);

		Scanner sc;
		sc = new Scanner(System.in);
		float lengthRectangle, widthRectangle, perimeterRectangle;
		System.out.println("To calculate the perimeter, please enter the length of the rectangle : ");
		lengthRectangle = sc.nextFloat();
		System.out.println("and now, please enter its width :");
		widthRectangle = sc.nextFloat();
		perimeterRectangle = Utils.perimeterRectangle(lengthRectangle, widthRectangle);
		System.out.println("Length : " + lengthRectangle + "cm \nWidth : " + widthRectangle + "cm \nPerimeter : "
				+ perimeterRectangle + "cm");
		sc.close();

	}

}
