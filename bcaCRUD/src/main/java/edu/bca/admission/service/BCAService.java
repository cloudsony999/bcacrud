package edu.bca.admission.service;

import java.util.List;

import org.springframework.stereotype.Component;

import edu.bca.admission.entity.BCA;

@Component
public interface BCAService {

	BCA createStudent(BCA bca);// Rs.1000

	BCA findStudent(int rollNo);// Rs. 500

	BCA updateStudent(BCA bca, int rollNo);// Rs. 1500

	String deleteStudent(int rollNo);// Rs. 500

	List<BCA> callAllStudent();// Rs. 2000

	// Rs.5500

}
