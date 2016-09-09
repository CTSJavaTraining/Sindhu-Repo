package com.cts.training;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EmployeeManagement {

	private static final Logger logger = Logger.getLogger(EmployeeManagement.class);

	public static void main(String args[]) {

		System.out.println("Press 1 to INSERT");
		System.out.println("Press 2 to UPDATE");
		System.out.println("Press 3 to VIEW");
		System.out.println("Press 4 to DELETE");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			CrudOperation.crudOperation.insertEmployee();
			break;
		case 2:
			System.out.println("Enter the empId");
			int id = sc.nextInt();
			CrudOperation.crudOperation.updateEmployee(id);
			break;
		case 3:
			System.out.println("Enter the empId");
			int id1 = sc.nextInt();
			CrudOperation.crudOperation.viewEmployee(id1);
			break;
		case 4:
			System.out.println("Enter the empId");
			int id2 = sc.nextInt();
			CrudOperation.crudOperation.deleteEmployee(id2);
			break;
		default:
			logger.info("invalid choice");
			break;
		}
	}

	public static SessionFactory factoryProvider() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		return configuration.buildSessionFactory(serviceRegistry);
	}

}
