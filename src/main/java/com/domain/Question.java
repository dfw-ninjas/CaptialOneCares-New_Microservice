package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Question")
public class Question {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="questionId")
	 private Integer questionId;
	 
	 @Column(name="question")
	 private String question;
	 
	 @Column(name="answer")
	 private String answer;
	 
	 @Column(name="options")
	 private String options;
	 
	 @Column(name="misc")
	 private String misc;

	public Integer getId() {
		return questionId;
	}

	public void setId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getMisc() {
		return misc;
	}

	public void setMisc(String misc) {
		this.misc = misc;
	}
}
