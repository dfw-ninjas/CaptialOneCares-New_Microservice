package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Leaderboard")
public class Leaderboard {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="student_id")
	 private Integer student_id;
	 
	 @Column(name="score")
	 private Integer score;
	 
	 @Column(name="rank")
	 private Integer rank;
	 
	 @Column(name="housing_price")
	 private Float housing_price;

	 @Column(name="mobile_plan_price")
	 private Float mobile_plan_price;
	 
	 @Column(name="food_price")
	 private Float food_price;
	 
	 @Column(name="fun_price")
	 private Float fun_price;
	 
	 @Column(name="electricity_price")
	 private Float electricity_price;

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Float getHousing_price() {
		return housing_price;
	}

	public void setHousing_price(Float housing_price) {
		this.housing_price = housing_price;
	}

	public Float getMobile_plan_price() {
		return mobile_plan_price;
	}

	public void setMobile_plan_price(Float mobile_plan_price) {
		this.mobile_plan_price = mobile_plan_price;
	}

	public Float getFood_price() {
		return food_price;
	}

	public void setFood_price(Float food_price) {
		this.food_price = food_price;
	}

	public Float getFun_price() {
		return fun_price;
	}

	public void setFun_price(Float fun_price) {
		this.fun_price = fun_price;
	}

	public Float getElectricity_price() {
		return electricity_price;
	}

	public void setElectricity_price(Float electricity_price) {
		this.electricity_price = electricity_price;
	}

	 
	 
}
