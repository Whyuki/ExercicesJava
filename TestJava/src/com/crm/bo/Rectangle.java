/**
 * 
 */
package com.crm.bo;

/**
 * @author Joanna
 *
 */
public class Rectangle {

	private String name;
	private float length;
	private float width;

	// "Construction d'un objet Rectangle (sans paramètres)
	public Rectangle() {
		name = "";
	}

	// Construction d'un objet Rectangle avec paramètres (nom, longueur, largeur)
	public Rectangle(String name, float length, float width) {
		this.name = name;
		this.length = length;
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float perimeter() {
		return (length + width) * 2;
	}

	public String perimeter(String unit) {
		return this.perimeter() + unit;
	}

	public float area() {
		return length * width;
	}

	public String area(String unit) {
		return this.area() + unit;
	}

	public void showDetails() {
		System.out.println("\n" + name + " :");
		System.out.println("length : " + length + ", width " + width);
		System.out.println("perimeter : " + perimeter() + ", area : " + area());
	}

	public void compareRectangle(Rectangle rToCompare) {

		if (this.area() > rToCompare.area()) {
			System.out.println("\nThe " + this.name + " is the biggest !");
		} else if (rToCompare.area() > this.area()) {
			System.out.println("\nThe " + rToCompare.name + " is the biggest !");
		} else {
			System.out.println("\nThey are equal !");
		}
	}

	public boolean isBiggerThan(Rectangle rToCompare) {
		if (this.area() > rToCompare.area()) {
			return true;
		} else {
			return false;
		}

	}
}
