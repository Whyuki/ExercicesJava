import java.util.Scanner;

import com.crm.api.Utils;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class CircleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The sky is " + Utils.COLOR_BLUE + " !\n");
		Scanner sc = new Scanner(System.in);
		int radius;
		double area;
		System.out.println("Please enter the radius of the circle :");
		radius = sc.nextInt();
		area = Utils.circleAreaV2(radius);
		System.out.println("Circle area = " + area);
		sc.close();
	}

}
