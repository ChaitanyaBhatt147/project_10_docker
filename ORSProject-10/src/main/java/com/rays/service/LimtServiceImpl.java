package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LimitDAOInt;
import com.rays.dto.LimitDTO;

@Service
@Transactional
public class LimtServiceImpl extends BaseServiceImpl<LimitDTO, LimitDAOInt> implements LimitServiceInt{

}
