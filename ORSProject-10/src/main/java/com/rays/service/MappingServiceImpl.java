package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MappingDAOInt;
import com.rays.dto.MappingDTO;

@Service
@Transactional
public class MappingServiceImpl extends BaseServiceImpl<MappingDTO, MappingDAOInt> implements MappingServiceInt{

}
