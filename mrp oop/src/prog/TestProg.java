package prog;

import data.Person;
import data.Student;

public class TestProg {

	public static void main(String[] args) {
		new TestProg();
	}
	//
	public TestProg() {
		Person p1 = new Person();
		p1.setVorname("Anna");
		p1.setNachname("Mayer");
		p1.setFemale(true);
		Person.getPersonenListe().add(p1);
		//
		Person p2 = new Person();
		p2.setVorname("Franz");
		p2.setNachname("Huber");
		//p2.setFemale(false);
		Person.getPersonenListe().add(p2);
		//
		Student s1 = new Student();
		s1.setVorname("Robert");
		s1.setNachname("Hauer");
		s1.setFemale(false);
		s1.setSj(2018);
		Person.getPersonenListe().add(s1);
		//
		System.out.println(p1);
		System.out.println(p2);
		//
		System.out.println(s1);
		//
		//Student s2 = (Student) p1;
		//System.out.println(s2);
		//
		System.out.println("s1");
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Person);
		Person p3 = s1;
		//
		Person.getPersonenListe().add(p3);
		//
		System.out.println(p3);
		System.out.println("p3");
		System.out.println(p3 instanceof Student);
		System.out.println(p3 instanceof Person);
		//
		System.out.println("p2");
		System.out.println(p2 instanceof Student);
		System.out.println(p2 instanceof Person);
		//
		for (Person p : Person.getPersonenListe())
			System.out.println(p);
		//
		// for (int i = 0; i < Person.getPersonenListe().size(); i++)
		// System.out.println(Person.getPersonenListe().get(i));
	}

}
