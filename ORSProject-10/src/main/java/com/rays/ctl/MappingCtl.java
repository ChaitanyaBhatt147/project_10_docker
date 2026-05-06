package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 43d029de1fc0f4a06c93f9564a246214f9f371a1
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.MappingDTO;
import com.rays.form.MappingForm;
import com.rays.service.MappingServiceInt;

@RestController
@RequestMapping("Mapping")
public class MappingCtl extends BaseCtl<MappingForm, MappingDTO, MappingServiceInt> {
	
	@GetMapping("preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		List<DropdownList> list = new ArrayList<>();

		list.add(new DropdownList() {
			public String getKey() {
				return "Active";
			}

			public String getValue() {
				return "Active";
			}
		});

		list.add(new DropdownList() {
			public String getKey() {
				return "Inactive";
			}

			public String getValue() {
				return "Inactive";
			}
		});

		res.addResult("statusList", list);

		return res;
	}
}
