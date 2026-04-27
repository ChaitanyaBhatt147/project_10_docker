package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DonationCampDTO;

public class DonationCampForm extends BaseForm {
	@NotEmpty(message = "Camp Name is required")
	private String campName;
	@NotNull(message = "Camp Date is required")
	private Date campDate;
	@NotEmpty(message = "Organizer is required")
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
	public BaseDTO getDto() {
		DonationCampDTO dto = initDTO(new DonationCampDTO());
		dto.setCampName(campName);
		dto.setCampDate(campDate);
		dto.setOrganizer(organizer);
		return dto;
	}
}
