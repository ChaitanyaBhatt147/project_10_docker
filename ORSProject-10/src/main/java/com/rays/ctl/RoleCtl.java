package com.rays.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.RoleDTO;
import com.rays.form.RoleForm;
import com.rays.service.RoleServiceInt;

/**
 * Role Controller class.
 * 
 * This controller handles all HTTP requests related to Role module.
 * It extends BaseCtl to inherit common CRUD operations such as:
 * - Save
 * - Delete
 * - Get by ID
 * - Search with pagination
 * 
 * Additional functionality:
 * - Preload API to fetch role list for dropdown
 * 
 * Endpoints are mapped under "/Role".
 * 
 * It works with:
 * - RoleForm (input form)
 * - RoleDTO (data transfer object)
 * - RoleServiceInt (service layer)
 * 
 * @author Chaitanya Bhatt
 */
@RestController
@RequestMapping(value = "Role")
public class RoleCtl extends BaseCtl<RoleForm, RoleDTO, RoleServiceInt> {
	
	/**
	 * Preload API to fetch role list for dropdown.
	 * 
	 * @return ORSResponse containing role list
	 */
	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		RoleDTO dto = new RoleDTO();
		//dto.setStatus(RoleDTO.ACTIVE);

		List<DropdownList> list = baseService.search(dto, userContext);

		res.addResult("roleList", list);

		return res;
	}

}