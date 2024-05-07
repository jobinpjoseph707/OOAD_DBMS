package com.ilp03.service;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ilp03.doa.IncidentServiceDAO;
import com.ilp03.entity.*;

public class IncidentServiceImpl implements IncidentService {

	@Override
	public void getIncidentData(int incidentID) {
		// TODO Auto-generated method stub
		 try (Connection connection = IncidentServiceDAO.getConnection()) {
	            List<Employee> empolyees = IncidentServiceDAO.getAllIncidents(connection, incidentID);
	            System.out.println("-------------------------------------------------------------------------------------------------------------------|");
	            System.out.println(" First Name | Status       | Type of incident                                                                                 |");
	            System.out.println("------------|--------------|---------------------------------------------------------------------------------------|");

	            // Iterate over the incidents list and print each incident in tabular format
	            for (Employee employee : empolyees) {
	                System.out.printf("%11s | %-12s | %-80s |%n",
	                		employee.getFirstName(), employee.getTrainingEmployee().getStatus(), employee.getIncident().getType());
	            }
	            System.out.println("-------------------------------------------------------------------------------------------------------------------|");


		
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}}
