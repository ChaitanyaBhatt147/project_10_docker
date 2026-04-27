package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.MetadataDTO;
import com.rays.form.MetadataForm;
import com.rays.service.MetadataServiceInt;

@RestController
@RequestMapping(value = "Metadata")
public class MetadataCtl extends BaseCtl<MetadataForm, MetadataDTO, MetadataServiceInt>{

}
