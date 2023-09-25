package com.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data // All Arguments

//Or Add members one by one as below
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerLombok {

	private Integer id;
	private String name;
	private String city;
	private String email;
	private String phone;

}
