package org.usa.ri.co.batch.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.usa.ri.co.batch.entity.EligibilityDetails;

public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetails, Serializable>{

}
