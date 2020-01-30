package geometry;
import java.util.Scanner;

import com.crm.api.Utils;

/**
 * @author Joanna
 * 
 * calcul de l'aire d'un carré
 * 
 */
public class SquareArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float squareSide, squareArea;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the side of square : ");
		squareSide = sc.nextFloat();
		squareArea = Utils.squareArea(squareSide);
		System.out.println("The square area is " + squareArea);
		sc.close();
	}

}
