package org.usa.ri.co.batch.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "eligibility_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EligibilityDetails  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ed_trace_id")
	private Integer edTraceId;
	
	@Column(name = "benefit_amt")
	private Double benefitAmount;
	
	@Column(name = "case_num")
	private Integer caseNumber;
	
	@Column(name = "plan_name")
	private String planName;
	
	@Column(name = "create_dt")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	
	@Column(name = "plan_status")
	private String planStatus;
	
	@Column(name = "denial_reason")
	private String denialReason;
	
	@Column(name = "plan_start_dt")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date planStartDate;
	
	@Column(name = "plan_end_dt")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date planEndDate;
	
	@Column(name = "update_dt")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedDate;
	
}
