package edu.bca.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.bca.admission.entity.BCA;
import edu.bca.admission.repository.BCARepository;

@SpringBootApplication
public class BcaCrudApplication implements CommandLineRunner {

	@Autowired
	private BCARepository bcaRepository;

	public static void main(String[] args) {
		SpringApplication.run(BcaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BCA bca = BCA.builder().name("amitava").address("kolkata").email("a@gmail.com").mob(1234).build();
		BCA bca2 = BCA.builder().name("amit").address("delhi").email("b@gmail.com").mob(12345).build();
		BCA bca3 = BCA.builder().name("sumit").address("simla").email("c@gmail.com").mob(12354).build();
		BCA bca4 = BCA.builder().name("anil").address("chennai").email("d@gmail.com").mob(12384).build();
		BCA bca5 = BCA.builder().name("aniket").address("mysore").email("f@gmail.com").mob(12324).build();

		bcaRepository.save(bca);
		bcaRepository.save(bca2);
		bcaRepository.save(bca3);
		bcaRepository.save(bca4);
		bcaRepository.save(bca5);
		System.out.println("---------------------all saved-------------------");

	}

}
