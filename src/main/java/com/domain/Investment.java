/*
 * Investment Domain Class
 */

package com.domain;

import java.util.Date; //needed for the Date datatype 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Investment")
public class Investment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 
	@Column(name="investmentId")
	private Integer investmentId;
	 
	@Column(name="student_id")
	private Integer student_id;
		 
	@Column(name="investment_enrolled")
	private String investment_enrolled;
		 
	@Column(name="expiry_date")
	private Date expiry_date;
		 
	@Column(name = "penalty_price")
	private String penalty_price;

	public Integer getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(Integer investmentId) {
		this.investmentId = investmentId;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getInvestment_enrolled() {
		return investment_enrolled;
	}

	public void setInvestment_enrolled(String investment_enrolled) {
		this.investment_enrolled = investment_enrolled;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getPenalty_price() {
		return penalty_price;
	}

	public void setPenalty_price(String penalty_price) {
		this.penalty_price = penalty_price;
	}
	 


}
	 
	
	
