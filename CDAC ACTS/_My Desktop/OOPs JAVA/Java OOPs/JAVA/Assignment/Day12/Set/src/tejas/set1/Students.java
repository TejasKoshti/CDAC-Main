package tejas.set1;

import java.time.LocalDate;
import java.util.Objects;

public class Students implements Comparable<Students>{
	private Integer rollNo;
	private String name;
	private Course cousr;
	private LocalDate dob;

	public Students() {
		this.rollNo = 0;
		this.name = "";
		this.dob = null;
		this.cousr = null;
	}
	
	
	public Students(Integer rollNo, String name, Course cousr, LocalDate dob) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.cousr = cousr;
		this.dob = dob;
	}
	
	// ********************************************************
	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCousr() {
		return cousr;
	}

	public void setCousr(Course cousr) {
		this.cousr = cousr;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	// ********************************************************

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", cousr=" + cousr + ", dob=" + dob + "]";
	}


	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.rollNo.compareTo(o.rollNo);
	}
	
	@Override
	public int hashCode()
	{
		int readyHash = Objects.hash(cousr, dob, name, rollNo);
		 System.out.println("Ready hash "+ name + "" + readyHash);
		return readyHash;
	}
	
	
	
	
	
	

}
