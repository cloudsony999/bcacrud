package edu.bca.admission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bca.admission.entity.BCA;
import edu.bca.admission.service.BCAService;

@RestController
public class BCAController {

	@Autowired
	BCAService bcaService;

	@PostMapping("/bca")
	public BCA cStudent(@RequestBody BCA bca) {
		return bcaService.createStudent(bca);
	}

	@GetMapping("/bca/{rollNo}")
	public BCA gStudent(@PathVariable int rollNo) {
		return bcaService.findStudent(rollNo);
	}

	@GetMapping("/bca")
	public List<BCA> gAllStudents() {
		return bcaService.callAllStudent();

	}

	@PutMapping("/bca/{rollNo}")
	public BCA uStudent(@RequestBody BCA bca, @PathVariable int rollNo) {
		return bcaService.updateStudent(bca, rollNo);

	}

	@DeleteMapping("/bca/{rollNo}")
	public String dStudent(@PathVariable int rollNo) {
		return bcaService.deleteStudent(rollNo);

	}

}
