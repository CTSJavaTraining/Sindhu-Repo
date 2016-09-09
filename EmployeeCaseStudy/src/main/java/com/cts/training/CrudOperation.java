package com.cts.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CrudOperation {
	private static final Logger logger = Logger.getLogger(CrudOperation.class);
	private static final SessionFactory sessionFactory = EmployeeManagement.factoryProvider();

	public static CrudOperation crudOperation = new CrudOperation();

	public void insertEmployee() {
		EmpDetails emp2 = new EmpDetails();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<AddressDetails> address = new ArrayList<AddressDetails>();

		emp2.setName("Mahesh");
		emp2.setSalary(10000);
		emp2.setGrade("A");
		emp2.setBonus(emp2.calculateBonus(emp2.getGrade(), emp2.getSalary()));
		emp2.setDesignation("analyst");
		emp2.setDOJ("01/05/2012");
		emp2.setEmailID(emp2.checkEmail("xyz@gmail.com"));

		AddressDetails addressObj = new AddressDetails();
		addressObj.setEmpdetails(emp2);
		addressObj.setDoorNo(7);
		addressObj.setState("Tamil nadu");
		addressObj.setStreetName("abc");

		AddressDetails addressObj1 = new AddressDetails();
		addressObj1.setEmpdetails(emp2);
		addressObj1.setDoorNo(8);
		addressObj1.setState("Kerala");
		addressObj1.setStreetName("xyz");

		address.add(addressObj);
		address.add(addressObj1);

		emp2.setAddress(address);

		if (("xyz@gmail.com").equals(emp2.getEmailID())) {
			logger.info("employee already exists");
		} else {
			session.persist(emp2);
			session.getTransaction().commit(); // close the transaction
			logger.info("employee with empId : " + emp2.getId() + "=" + emp2.getAddress() + "INSERTED successfully");
		}

		session.close(); // close the session
	}

	public void updateEmployee(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		String hql = "UPDATE EmpDetails set name = :name WHERE id = :empId";
		Query query = session.createQuery(hql);
		query.setParameter("name", "divya");
		query.setParameter("empId", id);
		int result = query.executeUpdate();

		if (result == 0) {
			logger.info("invalid employee id");
		} else {

			String hql2 = "FROM EmpDetails WHERE id =:id";
			Query query2 = session.createQuery(hql2);
			query2.setParameter("id", id);
			List<?> results2 = query2.list();

			logger.info("employee details with empId :" + id + "=" + results2 + " UPDATED successfully");
		}
		session.getTransaction().commit();
		session.close(); // close the session
	}

	public void viewEmployee(int id1) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		String hql1 = "FROM EmpDetails WHERE id = :id1";
		Query query1 = session.createQuery(hql1);
		query1.setParameter("id1", id1);
		List<?> results1 = query1.list();
		results1.size();
		if (results1.size() == 0) {
			logger.info("invalid employee id");
		} else {

			logger.info("employee details with empId :" + id1 + "=" + results1);
		}
		session.close(); // close the session

	}

	public void deleteEmployee(int id2) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		String hql = "DELETE  FROM AddressDetails WHERE id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id2);
		int result = query.executeUpdate();
		logger.info("Rows affected: " + result);
		if (result == 0) {
			logger.info("invalid employee id");

		} else {

			session.getTransaction().commit();

			logger.info("employee details with empId :" + id2 + " DELETED successfully");

		}

		session.close(); // close the session

	}
}
