package data;

public class Student extends Person {
	//
	private int sj;
	//
	
	public Student() {
	}
	//

	public int getSj() {
		return sj;
	}

	public void setSj(int sj) {
		this.sj = sj;
	}
	//
	@Override
	public String toString() {
		return super.toString() + " inskribiert im SJ " + getSj();
	}
	
	

}
