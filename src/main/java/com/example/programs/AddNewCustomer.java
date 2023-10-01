package com.example.programs;

import java.io.IOException;

import com.example.dao.CustomerDao;
import com.example.dao.DaoFactory;
import com.example.entity.Customer;

public class AddNewCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		Customer c1 = new Customer();
		c1.setName("Kilima");
		c1.setCity("Daresalam");
		c1.setEmail("kilima@mail.com");
		c1.setPhone("453633773773");
		
		dao.addCustomer(c1);
		
		
		System.out.println(c1);
	}

}
