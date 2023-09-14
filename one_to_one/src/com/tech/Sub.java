package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Sub {
	
		@Id
		@GeneratedValue
		@PrimaryKeyJoinColumn
		@Column(name="Sid")
		private int sid;
		
		@Column(name="Sname")
		private String name;

		@OneToOne(targetEntity = Teacher .class )
		private Teacher Teacher ;

		public Sub() {
			
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Teacher getTeacher() {
			return Teacher;
		}

		public void setTeacher(Teacher teacher) {
			Teacher = teacher;
		}

		@Override
		public String toString() {
			return "Sub [sid=" + sid + ", name=" + name + ", Teacher=" + Teacher + "]";
		}
		
		
}
