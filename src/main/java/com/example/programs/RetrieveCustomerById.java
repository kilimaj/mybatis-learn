package com.example.programs;

import java.io.IOException;

import com.example.dao.CustomerDao;
import com.example.dao.DaoFactory;
import com.example.entity.Customer;

public class RetrieveCustomerById {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 6;
		Customer c1 = dao.getCustomerById(id);

		if (c1 == null) {
			System.out.println("No Customer data for id: " + id);
		} else {
			System.out.println(c1);
		}

	}

}
