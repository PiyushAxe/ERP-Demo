package com.axelor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

		@Id
		@GeneratedValue
		private long id;
		private String name;
		private String marks;
		private String email;
		
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Student(String name, String marks, String email) {
			this.name = name;
			this.marks = marks;
			this.email = email;
		}
		
		
		public String getEmail() {
			return email;
		}
		
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		public long getId() {
			return id;
		}
		
		
		public void setId(long id) {
			this.id = id;
		}
		
		
		public String getName() {
			return name;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		
		public void setMarks(String marks) {
			this.marks = marks;
		}
		
		
		public String getMarks() {
			return marks;
		}
		
}
