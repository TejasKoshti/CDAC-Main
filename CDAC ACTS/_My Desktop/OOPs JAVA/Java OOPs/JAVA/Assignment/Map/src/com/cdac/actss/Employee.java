package com.cdac.actss;

import java.util.Date;
import java.util.Objects;

import com.cdac.acts.enums.TitleEnum;

public class Employee {

		private int empId;
		private String name;
		private TitleEnum title;
		private Date doj;
		
		private static int EMP_ID_START = 100;

		public Employee(int empId, String name, String title, Date doj) {
			super();
			this.empId = EMP_ID_START++;
			this.name = name;
			this.title = TitleEnum.valueOf(title);
			this.doj = doj;
		}
		
//		public abstract double calculateSalary();

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public TitleEnum getTitle() {
			return title;
		}

		public void setTitle(TitleEnum title) {
			this.title = title;
		}

		public Date getDoj() {
			return doj;
		}

		public void setDoj(Date doj) {
			this.doj = doj;
		}

		public static int getEMP_ID_START() {
			return EMP_ID_START;
		}

		public static void setEMP_ID_START(int eMP_ID_START) {
			EMP_ID_START = eMP_ID_START;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", title=" + title + ", doj=" + doj + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(doj, empId, name, title);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(doj, other.doj) && empId == other.empId && Objects.equals(name, other.name)
					&& title == other.title;
		}
		
		
		
		
		

		
		
		
		
}
