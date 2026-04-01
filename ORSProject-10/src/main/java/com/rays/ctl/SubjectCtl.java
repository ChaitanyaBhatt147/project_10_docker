package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.form.SubjectForm;
import com.rays.service.CourseServiceInt;
import com.rays.service.SubjectServiceInt;

/**
 * Subject Controller class.
 * 
 * This controller handles all HTTP requests related to Subject module.
 * It extends BaseCtl to inherit common CRUD operations such as:
 * - Save
 * - Delete
 * - Get by ID
 * - Search with pagination
 * 
 * Additional functionality:
 * - Preload API to fetch course list for dropdown
 * 
 * Endpoints are mapped under "/Subject".
 * 
 * It works with:
 * - SubjectForm (input form)
 * - SubjectDTO (data transfer object)
 * - SubjectServiceInt (service layer)
 * 
 * @author Chaitanya Bhatt
 */
@RestController
@RequestMapping(value = "Subject")
public class SubjectCtl extends BaseCtl<SubjectForm, SubjectDTO, SubjectServiceInt> {
	
	/**
	 * Service for Course-related operations.
	 */
	@Autowired
	private CourseServiceInt courseService;
	
	
	/**
	 * Preload API to fetch course list for dropdown.
	 * 
	 * @return ORSResponse containing course list
	 */
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		List<DropdownList> list = courseService.search(new CourseDTO(), userContext);

		res.addResult("courseList", list);

		return res;
	}

}