package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CollegeDTO;
import com.rays.dto.StudentDTO;
import com.rays.form.StudentForm;
import com.rays.service.CollegeServiceInt;
import com.rays.service.StudentServiceInt;

/**
 * Student Controller class.
 * 
 * This controller handles all HTTP requests related to Student module.
 * It extends BaseCtl to inherit common CRUD operations such as:
 * - Save
 * - Delete
 * - Get by ID
 * - Search with pagination
 * 
 * Additional functionality:
 * - Preload API to fetch college list for dropdown
 * 
 * Endpoints are mapped under "/Student".
 * 
 * It works with:
 * - StudentForm (input form)
 * - StudentDTO (data transfer object)
 * - StudentServiceInt (service layer)
 * 
 * @author Chaitanya Bhatt
 */
@RestController
@RequestMapping(value = "Student")
public class StudentCtl extends BaseCtl<StudentForm, StudentDTO, StudentServiceInt> {
	
	/**
	 * Service for College-related operations.
	 */
	@Autowired
	private CollegeServiceInt collegeService;

	/**
	 * Preload API to fetch college list for dropdown.
	 * 
	 * @return ORSResponse containing college list
	 */
	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		List<CollegeDTO> list = collegeService.search(new CollegeDTO(), userContext);

		res.addResult("collegeList", list);

		return res;
	}

}