package org.usa.ri.co.batch.entity;

import java.io.Serializable;
import java.sql.Blob;

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
@Table(name = "CO_PDFS")
public class CorrespondencePDFS implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	
	@Column(name = "CASE_NUMBER")
	private Integer caseNumber;
	
	@Column(name = "PDF_DOCUMENT")
	private Blob pdfDocument;
	
	@Column(name = "PLAN_NAME")
	private String planName;
}
