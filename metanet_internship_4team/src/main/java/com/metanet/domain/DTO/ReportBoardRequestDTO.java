package com.metanet.domain.DTO;

import com.metanet.domain.Report_Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReportBoardRequestDTO {
	private int reportTableNumber;
	private String reportName;
	private String reportKind;
	private String reportDetail;
	private java.sql.Date crDa;
	
	@Builder
	public ReportBoardRequestDTO(int reportTableNumber, String reportName, String reportKind, String reportDetail) {
		this.reportTableNumber = reportTableNumber;
		this.reportName = reportName;
		this.reportKind = reportKind;
		this.reportDetail = reportDetail;
		}
	
	public Report_Table ToEntity() {
		return Report_Table.builder()
				.reportTableNumber(this.reportTableNumber)
				.reportName(this.reportName)
				.reportKind(this.reportKind)
				.reportDetail(this.reportDetail)
				.build();
	}
}