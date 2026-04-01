package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CollegeDTO;
import com.rays.dto.CourseDTO;
import com.rays.dto.FacultyDTO;
import com.rays.dto.SubjectDTO;
import com.rays.form.FacultyForm;
import com.rays.service.CollegeServiceInt;
import com.rays.service.CourseServiceInt;
import com.rays.service.FacultyServiceInt;
import com.rays.service.SubjectServiceInt;

/**
 * Faculty Controller class.
 * 
 * This controller handles all HTTP requests related to Faculty module.
 * It extends BaseCtl to inherit common CRUD operations such as:
 * - Save
 * - Delete
 * - Get by ID
 * - Search with pagination
 * 
 * Additional functionality:
 * - Preload API to fetch dropdown data for UI (Course, Subject, College)
 * 
 * Endpoints are mapped under "/Faculty".
 * 
 * It works with:
 * - FacultyForm (input form)
 * - FacultyDTO (data transfer object)
 * - FacultyServiceInt (service layer)
 * 
 * @author Chaitanya Bhatt
 */
@RestController
@RequestMapping(value = "Faculty")
public class FacultyCtl extends BaseCtl<FacultyForm, FacultyDTO, FacultyServiceInt> {

	/**
	 * Service for Course-related operations.
	 */
	@Autowired
	private CourseServiceInt courseService;

	/**
	 * Service for Subject-related operations.
	 */
	@Autowired
	private SubjectServiceInt subjectService;

	/**
	 * Service for College-related operations.
	 */
	@Autowired
	private CollegeServiceInt collegeService;

	/**
	 * Preload API to fetch dropdown data for Faculty form.
	 * 
	 * This API returns:
	 * - Course list
	 * - Subject list
	 * - College list
	 * 
	 * Used in UI to populate dropdowns.
	 * 
	 * @return ORSResponse containing dropdown data
	 */
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		List<DropdownList> courseList = courseService.search(new CourseDTO(), userContext);
		List<DropdownList> subjectList = subjectService.search(new SubjectDTO(), userContext);
		List<DropdownList> collegeList = collegeService.search(new CollegeDTO(), userContext);

		res.addResult("courseList", courseList);
		res.addResult("subjectList", subjectList);
		res.addResult("collegeList", collegeList);

		return res;
	}

}