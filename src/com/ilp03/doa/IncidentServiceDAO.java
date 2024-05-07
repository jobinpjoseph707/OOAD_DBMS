package com.ilp03.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ilp03.entity.Employee;
import com.ilp03.entity.Incident;
import com.ilp03.entity.Training;
import com.ilp03.entity.TrainingEmployee;
public class IncidentServiceDAO {
	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/workspacesafety_db?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "April@9400";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> getAllIncidents(Connection connection, int incidentID) {
        ArrayList<Employee> empolyees = new ArrayList<>();
        String query = "SELECT emp.FirstName, te.Status, inc.Type " +
                       "FROM Employees emp " +
                       "JOIN training_employee te ON emp.EmployeeID = te.EmployeeID " +
                       "JOIN Training tr ON te.TrainingID = tr.TrainingID " +
                       "JOIN Incidents inc ON inc.TrainingID = tr.TrainingID " +
                       "WHERE inc.IncidentID = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, incidentID);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String firstName = resultSet.getString("FirstName");
                    String status = resultSet.getString("Status");
                    String type = resultSet.getString("Type");
    				Employee employee= new Employee();
    				employee.setFirstName(firstName);
    				
    				
    				TrainingEmployee trainingEmployee= new TrainingEmployee(status);
    				trainingEmployee.setStatus(status);
    				Incident incident= new Incident(type);
    				incident.setType(type);
    				employee.setTrainingEmployee(trainingEmployee);
    				employee.setIncident(incident);
    				
    				empolyees.add(employee);
    				
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empolyees;
    }
    public static List<Employee> getTraningOnmonth(Connection connection, int incidentMonth) {
        ArrayList<Employee> empolyees = new ArrayList<>();
//        System.out.println("incidentMonthincidentMonth"+incidentMonth);
        String query = "SELECT title,Description\r\n"
        		+ "FROM Training\r\n"
        		+ "WHERE MONTH(StartDate) = ? OR MONTH(EndDate) = ?\r\n"
        		+ ";";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, incidentMonth);
            statement.setInt(2, incidentMonth);

            try (
            		ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String title = resultSet.getString("title");
                    String Description = resultSet.getString("Description");
         
    				Employee employee= new Employee();    				
    				
    				Training training = new Training(title);
    				training.setTitle(title);
    				training.setDescription(Description);
    			
    				employee.setTraining(training);
    				
    				empolyees.add(employee);
    				
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empolyees;
    }


}
