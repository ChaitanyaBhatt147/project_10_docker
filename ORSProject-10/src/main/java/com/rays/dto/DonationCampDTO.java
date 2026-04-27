package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "DonationCamp")
public class DonationCampDTO extends BaseDTO{
	@Column(name = "campName")
	private String campName;
	@Column(name = "campDate")
	private Date campDate;
	@Column(name = "organizer")
	private String organizer;

	public String getCampName() {
		return campName;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}

	public Date getCampDate() {
		return campDate;
	}

	public void setCampDate(Date campDate) {
		this.campDate = campDate;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "campName";
	}

	@Override
	public String getUniqueValue() {
		return campName;
	}

	@Override
	public String getLabel() {
		return "DonationCamp";
	}

	@Override
	public String getTableName() {
		return "DonationCamp";
	}
}
