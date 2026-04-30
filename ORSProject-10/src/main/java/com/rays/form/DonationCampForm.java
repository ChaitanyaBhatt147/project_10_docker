package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DonationCampDTO;

/**
 * Form class for DonationCamp entity.
 * 
 * This class is used to capture user input for Donation Camp operations
 * such as create and update.
 * 
 * Features:
 * - Validates camp name (alphanumeric)
 * - Validates camp date (not null)
 * - Validates organizer name (alphabets only)
 * - Converts form data into DonationCampDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class DonationCampForm extends BaseForm {

	/**
	 * Name of the donation camp.
	 */
	@NotEmpty(message = "Camp Name is required")
	@Pattern(regexp = "^[A-Za-z0-9 .,&-]{2,50}$", message = "Invalid Camp Name")
	private String campName;

	/**
	 * Date of the donation camp.
	 */
	@NotNull(message = "Camp Date is required")
	private Date campDate;

	/**
	 * Organizer of the donation camp.
	 */
	@NotEmpty(message = "Organizer is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Organizer must contain only alphabets")
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

	/**
	 * Converts form data into DonationCampDTO.
	 * 
	 * @return DonationCampDTO object
	 */
	@Override
	public BaseDTO getDto() {
		DonationCampDTO dto = initDTO(new DonationCampDTO());
		dto.setCampName(campName);
		dto.setCampDate(campDate);
		dto.setOrganizer(organizer);
		return dto;
	}
}