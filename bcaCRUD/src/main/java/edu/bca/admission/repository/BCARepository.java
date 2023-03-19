package edu.bca.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.bca.admission.entity.BCA;

public interface BCARepository extends JpaRepository<BCA, Integer> {

}
