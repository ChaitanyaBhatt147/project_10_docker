package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DonationCampDTO;
import com.rays.form.DonationCampForm;
import com.rays.service.DonationCampServiceInt;

@RestController
@RequestMapping(value = "DonationCamp")
public class DonationCampCtl extends BaseCtl<DonationCampForm, DonationCampDTO, DonationCampServiceInt>{

}
