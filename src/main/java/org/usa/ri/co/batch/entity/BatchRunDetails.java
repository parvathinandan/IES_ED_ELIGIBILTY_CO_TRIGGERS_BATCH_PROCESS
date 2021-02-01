package org.usa.ri.co.batch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "BATCH_RUN_SEQ")
	@Id
	private Integer batchRunSeq;
	
	@Column(name = "BATCH_NAME")
	private String batchName;
	
	@Column(name = "BATCH_RUN_STATE")
	private String batchRunStatus;
	
	@Column(name = "INSTANCE_NUMBER")
	private Integer instanceNumber;
	
	@Column(name = "START_DATE")
	private Timestamp startDate;
	
	@Column(name = "END_DATE")
	private Timestamp endDate;
}
