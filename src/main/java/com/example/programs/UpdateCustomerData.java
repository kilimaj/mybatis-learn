package com.example.programs;

import java.io.IOException;

import com.example.dao.CustomerDao;
import com.example.dao.DaoFactory;
import com.example.entity.Customer;

public class UpdateCustomerData {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 3;
		Customer c1 = dao.getCustomerById(id);

		if (c1 == null) {
			System.out.println("No Customer data for id: " + id);
		} else {
			System.out.println("Before updating ....." + c1);
			c1.setCity("Dodona");
			c1.setPhone("111456700000");
			dao.updateCustomer(c1);
			System.out.println("After updating ....." + c1);
		}

	}

}
