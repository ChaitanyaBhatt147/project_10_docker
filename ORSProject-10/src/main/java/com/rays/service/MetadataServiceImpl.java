package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MetadataDAOInt;
import com.rays.dto.MetadataDTO;

@Service
@Transactional
public class MetadataServiceImpl extends BaseServiceImpl<MetadataDTO, MetadataDAOInt> implements MetadataServiceInt{

}
