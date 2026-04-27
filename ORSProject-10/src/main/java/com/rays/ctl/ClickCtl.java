package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ClickDTO;
import com.rays.form.ClickForm;
import com.rays.service.ClickServiceInt;

@RestController
@RequestMapping(value = "Click")
public class ClickCtl extends BaseCtl<ClickForm, ClickDTO, ClickServiceInt>{

}
