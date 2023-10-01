package com.example.programs;

import java.io.IOException;

import com.example.dao.CustomerDao;
import com.example.dao.DaoFactory;
import com.example.entity.Customer;

public class DeleteCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		int id = 5;
		Customer c1 = dao.getCustomerById(id);

		if (c1 == null) {
			System.out.println("No data found for id " + id);
		} else {
			dao.deleteCustomer(9);
			System.out.println("Customer with id " + id + " is deleted.");
		}
	}

}
