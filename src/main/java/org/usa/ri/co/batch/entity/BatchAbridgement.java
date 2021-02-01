package org.usa.ri.co.batch.entity;

import java.io.Serializable;

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
@Table(name = "BATCH_SUMMARY")
public class BatchAbridgement implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "SUMMARY_ID")
	@Id
	private Integer summaryId;
	
	@Column(name = "BATCH_NAME")
	private String batchName;
	
	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	
	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	
	@Column(name = "TOTAL_TRIGGER_COUNT")
	private Integer totalTriggerCount;
}
