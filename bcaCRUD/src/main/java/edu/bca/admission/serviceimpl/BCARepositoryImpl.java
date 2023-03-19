package edu.bca.admission.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bca.admission.entity.BCA;
import edu.bca.admission.repository.BCARepository;
import edu.bca.admission.service.BCAService;

@Service
public class BCARepositoryImpl implements BCAService {

	@Autowired
	BCARepository bcaRepository;

	// new student is created and saved in DB
	@Override
	public BCA createStudent(BCA bca) {
//		BCA bcaNew=bcaRepository.save(bca);
//		return bcaNew;
		return bcaRepository.save(bca);
	}

	// find an existing student
	@Override
	public BCA findStudent(int rollNo) {

		return bcaRepository.findById(rollNo).get();
	}

	// update details of an existing student
	@Override
	public BCA updateStudent(BCA bca, int rollNo) {
		BCA _bca = bcaRepository.findById(rollNo).get();
		_bca.setEmail(bca.getEmail());
		_bca.setMob(bca.getMob());
		return bcaRepository.save(_bca);

	}

	// delete an existing student
	@Override
	public String deleteStudent(int rollNo) {

		bcaRepository.deleteById(rollNo);
		return "the BCA student with rollNo " + rollNo + " has been deleted...";
	}

	// fetch all BCA students
	@Override
	public List<BCA> callAllStudent() {
		// TODO Auto-generated method stub
		return bcaRepository.findAll();
	}

}
