package application;

import java.time.LocalDate;

public class Model {
	private String name;
	private int number;
	private boolean bool;
	private LocalDate date;
	
	public Model(){
		name = "";
		number = 0;
		bool = false;
		date = LocalDate.now();
	}
	
	public String getName() {
		return name;
	}
	
	public void setNom(String newName) {
		name = newName;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	
	public boolean getBool() {
		return bool;
	}
	
	public void setBool(boolean newBool) {
		bool = newBool;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate newDate) {
		date = newDate;
	}
}
