package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.UsrView;

/*
 * �𵨰� �並 �����ϴ� ��
 * ����� �Է��� ó���ϴ� ��
 */
public class StudentController {
	//StudentModel
	//StudentView
	private StudentModel studentmodel;

	//private StudentView userview;
	
	public StudentController(StudentModel studentmodel) {
		this.studentmodel = studentmodel;
	}
}
