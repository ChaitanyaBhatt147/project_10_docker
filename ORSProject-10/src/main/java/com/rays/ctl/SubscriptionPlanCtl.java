package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SubscriptionPlanDTO;
import com.rays.form.SubscriptionPlanForm;
import com.rays.service.SubscriptionPlanServiceInt;

@RestController
@RequestMapping(value = "SubscriptionPlan")
public class SubscriptionPlanCtl extends BaseCtl<SubscriptionPlanForm, SubscriptionPlanDTO, SubscriptionPlanServiceInt>{
	
}
