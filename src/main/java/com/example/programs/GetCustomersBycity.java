package com.example.programs;

import java.io.IOException;
import java.util.List;

import com.example.dao.CustomerDao;
import com.example.dao.DaoFactory;
import com.example.entity.Customer;

public class GetCustomersBycity {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		String city = "Dodoma";

		List<Customer> list = dao.getCustomerByCity(city);

		System.out.println("There are " + list.size() + " customers from " + city);

		for (Customer c : list) {
			System.out.println(c);
		}
	}

}
