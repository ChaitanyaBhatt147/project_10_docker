package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ClickDAOInt;
import com.rays.dto.ClickDTO;

@Service
public class ClickServiceImpl extends BaseServiceImpl<ClickDTO, ClickDAOInt> implements ClickServiceInt{

}
