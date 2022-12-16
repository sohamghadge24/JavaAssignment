package com.labAssignment.Operation;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int SId;
    private String name;
    private int marks;
    private String remark;
    
    
    public Student() {
    	super();
    }
    
    
	public Student(int sId, String name, int marks, String remark) {
		super();
		SId = sId;
		this.name = name;
		this.marks = marks;
		this.remark = remark;
	}

	public int getSId() {
		return SId;
	}



	public void setSId(int sId) {
		SId = sId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	@Override
	public String toString() {
		return "Student [SId=" + SId + ", name=" + name + ", marks=" + marks + ", remark=" + remark + "]";
	}


	
}
