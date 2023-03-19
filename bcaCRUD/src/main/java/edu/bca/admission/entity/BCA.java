package edu.bca.admission.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "bcakolkata")
public class BCA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bcarollno")
	private Integer rollNo;
	@Column(name = "bcaname")
	private String name;
	@Column(name = "bcaemail")
	private String email;
	@Column(name = "bcaaddress")
	private String address;
	@Column(name = "bcamob")
	private Integer mob;

}
