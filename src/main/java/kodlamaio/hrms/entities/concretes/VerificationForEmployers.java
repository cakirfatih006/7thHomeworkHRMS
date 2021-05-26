package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Table;

@Entity
@Table(name="verification_code_employers")
			//@PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
public class VerificationForEmployers extends VerificationCode { // buraları inheritance yapısına uygun hale getir.

				
	@GeneratedValue(strategy = GenerationType.IDENTITY)				
	@Column(name="employee_id")	
	private int employer_id;
	
	
}
