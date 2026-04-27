package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.BranchManagerDTO;
import com.rays.form.BranchManagerForm;
import com.rays.service.BranchManagerServiceInt;

@RestController
@RequestMapping(name = "BranchManager")
public class BranchManagerCtl extends BaseCtl<BranchManagerForm, BranchManagerDTO, BranchManagerServiceInt>{
	
}
