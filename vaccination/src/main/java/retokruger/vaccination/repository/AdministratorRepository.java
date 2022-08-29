package retokruger.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import retokruger.vaccination.model.Administrator;

/**
 * administratorRepository
 */
@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long>{

    
}