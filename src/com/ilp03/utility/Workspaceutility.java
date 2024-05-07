package com.ilp03.utility;
import java.util.Scanner;

import com.ilp03.service.IncidentServiceImpl;
import com.ilp03.service.TrainingServiceImpl;

public class Workspaceutility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
	 
			//EmployeeDAO.getConnection();
	 
		Scanner scanner=new Scanner(System.in);
		System.out.println("                         Workplace Safety and Ergonomics Improvement");

		char goToMainMenu='y';
		while(goToMainMenu=='y')
		{
			System.out.println("1.incident status 2. trainings in a month");
			System.out.println("please select any one case");

			int option = scanner.nextInt();
			
			switch(option) {
					case 1:	
							System.out.println("Enter incident id for the incident status");
							int incidentid = scanner.nextInt();
						    IncidentServiceImpl incidentService = new IncidentServiceImpl();
							incidentService.getIncidentData(incidentid);
							break;

					case 2:
							System.out.println("Enter month to get the training of the month");
							int trainingMonth = scanner.nextInt();
						    TrainingServiceImpl TrainingService = new TrainingServiceImpl();
							TrainingService.getTraningOnmonth(trainingMonth);
							break;
					default: System.out.println("Invalid Choice");
						}
			System.out.println("Go back to main menu (y/n):");
			goToMainMenu=scanner.next().charAt(0);
		}
	 
//		IncidentServiceImpl incidentService = new IncidentServiceImpl();
//		incidentService.getIncidentData(1);
//		TrainingServiceImpl TrainingService = new TrainingServiceImpl();
//		TrainingService.getTraningOnmonth(5);
//	 
			//employeeService.getCompletedEmployees();
	 
		}
	

}
