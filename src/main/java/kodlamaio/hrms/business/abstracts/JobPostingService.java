package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;

public interface JobPostingService {

	DataResult<List<JobPosting>> getAll();
	
	DataResult<List<JobPosting>> getAllSortedByActivated();
	
	DataResult<List<JobPosting>> getAllSortedByDate();
	
	Result add(JobPosting jobPosting);
	
	Result update(JobPosting jobPosting);
	
}
