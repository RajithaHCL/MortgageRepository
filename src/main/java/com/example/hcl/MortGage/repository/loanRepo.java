package com.example.hcl.MortGage.repository;


	import java.util.List;
	import org.hibernate.annotations.Loader;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;
    import com.example.hcl.MortGage.entity.Loan;
    import com.example.hcl.MortGage.entity.User;

	
	
	@Repository
	public interface loanRepo   extends JpaRepository<User , Long>{
		
	@Query(value="select* from loan where loanmount<=:userloanamount",nativeQuery=true)

    List<Loan> findByLoanAmmount(long  userLoanAmmoun) ;
			

}