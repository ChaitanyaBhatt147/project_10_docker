package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CredentialDTO;
import com.rays.form.CredentialForm;
import com.rays.service.CredentialServiceInt;

@RestController
@RequestMapping(value = "Credential")
public class CredentialCtl extends BaseCtl<CredentialForm, CredentialDTO, CredentialServiceInt>{

}
