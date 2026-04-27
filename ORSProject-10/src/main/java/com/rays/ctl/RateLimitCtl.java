package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.RateLimitDTO;
import com.rays.form.RateLimitForm;
import com.rays.service.RateLimitServiceInt;

@RestController
@RequestMapping(value = "RateLimit")
public class RateLimitCtl extends BaseCtl<RateLimitForm, RateLimitDTO, RateLimitServiceInt>{

}
