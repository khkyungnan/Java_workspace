package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
//public Student(String name, int age, String grade) {
		 Student student1 = new Student("kh�л�",20,"1�г�");
		 
		//�л� ���� ���
		 student1.displayInfo();

	/*
	 * �л��� 3�� ���� 3�� ����ϱ�
	 * student2, student3, student4
	 * ������ �̸��� ���̿� �г��� displayInfo(); �� ����ؼ� ����ϼ���.
	 */
		 Student student2 = new Student("kh����",21,"2�г�");
		 student2.displayInfo();
		 Student student3 = new Student("kh�޺�",22,"3�г�");
		 student3.displayInfo();
		 Student student4 = new Student("kh���",23,"4�г�");
		 student4.displayInfo();
		 
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� �г�","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� �̸�","�� ��°�� �̸�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 System.out.println("ó���� ����","�� ��°�� ����","�� ��°�� �г�");
		 

	}

}



