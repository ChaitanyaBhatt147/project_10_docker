package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CriptoCurrencyDTO;
import com.rays.form.CriptoCurrencyForm;
import com.rays.service.CriptoCurrencyServiceInt;

@RestController
@RequestMapping(value = "Criptocurrency")
public class CriptoCurrencyCtl extends BaseCtl<CriptoCurrencyForm, CriptoCurrencyDTO, CriptoCurrencyServiceInt>{

}
