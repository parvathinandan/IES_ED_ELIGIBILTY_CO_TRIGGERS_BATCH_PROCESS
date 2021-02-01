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
@Table(name = "co_triggers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoTriggers implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "trg_id")
	private Integer triggeredId;
	
	@Column(name = "case_num")
	private Integer caseNumber;
	
	@Column(name = "create_dt")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	
	@Column(name = "trg_status")
	private String triggeredStatus;
	
	@Column(name = "update_dt")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	
}
