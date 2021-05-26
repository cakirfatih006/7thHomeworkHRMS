package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Table;


@Entity
@Table(name="verification_code_candidate")
			//@PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
public class VerificationForCandidate extends VerificationCode{

	
						
	@GeneratedValue(strategy = GenerationType.IDENTITY)				
	@Column(name="candidate_id")	
	private int candidate_id;
	
	
}
