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

	public Rectangle() {
		name = "";
		System.out.println("Construction d'un objet Rectangle (sans paramètres) ");
	}

	public Rectangle(String name, float length, float width) {
		this.name = name;
		this.length = length;
		this.width = width;
		System.out.println("Construction d'un objet Rectangle avec paramètres (nom, longueur, largeur) ");
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

	public float perimeterCalculator(float length, float width) {
		float perimeter;
		perimeter = (length + width) * 2;
		return perimeter;
	}

	public float areaCalculator(float length, float width) {
		float area;
		area = length * width;
		return area;
	}

	public void showDetails() {
		System.out.println("\n" + name + " :");
		System.out.println("length : " + length + ", width " + width);

		System.out.println(
				"perimeter : " + perimeterCalculator(length, width) + ", area : " + areaCalculator(length, width));

	}

	public void compareRectangle(Rectangle rToCompare) {

		if (this.areaCalculator(length, width) > rToCompare.areaCalculator(length, width)) {
			System.out.println("\nThe " + this.name + " is the biggest !");
		} else if (rToCompare.areaCalculator(length, width) > this.areaCalculator(length, width)) {
			System.out.println("\nThe " + rToCompare.name + " is the biggest !");
		}

	}
}
