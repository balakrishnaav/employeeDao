package com.medplus.employee.main;

import java.util.Scanner;

import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;

public class GetNetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println(service.calculate(sc.nextInt()));
		sc.close();

	}

}
