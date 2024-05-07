package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ilp03.doa.IncidentServiceDAO;
import com.ilp03.entity.Employee;

public class TrainingServiceImpl implements TrainingService{

	@Override
	public void getTraningOnmonth(int incidentMonth) {
			// TODO Auto-generated method stub
			 try (Connection connection = IncidentServiceDAO.getConnection()) {
		            List<Employee> empolyees = IncidentServiceDAO.getTraningOnmonth(connection,incidentMonth);
		            System.out.println("+---------------------+-------------------------------------------------------------------------");
		            System.out.println(" Title                | Discription    ");
		            System.out.println("+---------------------+--------------------------------------------------------------------------");

		            // Iterate over the incidents list and print each incident in tabular format
		            for (Employee employee : empolyees) {
		                System.out.printf("%22s | %-12s|%n",
		                		employee.getTraining().getTitle(), employee.getTraining().getDescription());
		            }
		            System.out.println("+------------------------------------------------------------------------------------------------------------------|");

			
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}



}
