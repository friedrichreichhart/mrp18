package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> personenListe = new ArrayList<>();
	//
	
	protected String vorname;
	protected String nachname;
	private boolean female;
	//
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public boolean isFemale() {
		return female;
	}
	public void setFemale(boolean female) {
		this.female = female;
	}
	//
	@Override
	public String toString() {
		return (isFemale() ? "Frau" : "Mann") + " " + getVorname() + " " + getNachname();
	}
	//
	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}
	
	

}
