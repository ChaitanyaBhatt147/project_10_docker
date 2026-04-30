package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.BlockListDTO;
import com.rays.form.BlockListForm;
import com.rays.service.BlockListServiceInt;

@RestController
@RequestMapping(value = "BlockList")
public class BlockListCtl extends BaseCtl<BlockListForm, BlockListDTO, BlockListServiceInt>{
	
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
