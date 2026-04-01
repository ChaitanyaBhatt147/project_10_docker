package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CollegeDTO;
import com.rays.form.CollegeForm;
import com.rays.service.CollegeServiceInt;

/**
 * College Controller class.
 * 
 * This controller handles all HTTP requests related to College module.
 * It extends BaseCtl to inherit common CRUD operations such as:
 * - Save
 * - Delete
 * - Get by ID
 * - Search with pagination
 * 
 * Endpoints are mapped under "/College".
 * 
 * It works with:
 * - CollegeForm (input form)
 * - CollegeDTO (data transfer object)
 * - CollegeServiceInt (service layer)
 * 
 * @author Chaitanya Bhatt
 */
@RestController
@RequestMapping(value = "College")
public class CollegeCtl extends BaseCtl<CollegeForm, CollegeDTO, CollegeServiceInt> {

}