package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.UsrView;

/*
 * 모델과 뷰를 연결하는 곳
 * 사용자 입력을 처리하는 곳
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
