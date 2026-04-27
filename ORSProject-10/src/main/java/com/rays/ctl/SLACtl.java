package com.rays.ctl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.RoleDTO;
import com.rays.dto.SLADTO;
import com.rays.form.SLAForm;
import com.rays.service.SLAServiceInt;

@RestController
@RequestMapping(value = "SLA")
public class SLACtl extends BaseCtl<SLAForm, SLADTO, SLAServiceInt>{
	
	@GetMapping("preload")
	public ORSResponse preload() {

	    ORSResponse res = new ORSResponse(true);

	    List<DropdownList> list = new ArrayList<>();

	    list.add(new DropdownList() {
	        public String getKey() { return "Active"; }
	        public String getValue() { return "Active"; }
	    });

	    list.add(new DropdownList() {
	        public String getKey() { return "Inactive"; }
	        public String getValue() { return "Inactive"; }
	    });

	    res.addResult("statusList", list);

	    return res;
	}
}
