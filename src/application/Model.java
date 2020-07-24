package application;

import java.time.LocalDate;

public class Model{
	private String text;
	private int number;
	private boolean bool;
	private LocalDate date;
	
	public Model(){
		text = "";
		number = 0;
		bool = false;
		date = LocalDate.now();
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String newText) {
		System.out.println("Modification texte : " + newText);
		text = newText;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int newNumber) {
		System.out.println("Modification nombre : " + newNumber);
		number = newNumber;
	}
	
	public boolean getBool() {
		return bool;
	}
	
	public void setBool(boolean newBool) {
		System.out.println("Modification boolean: " + newBool);
		bool = newBool;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate newDate) {
		System.out.println("Modification date : " + newDate);
		date = newDate;
	}
}
