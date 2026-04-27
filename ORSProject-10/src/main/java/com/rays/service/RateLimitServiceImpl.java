package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RateLimitDAOInt;
import com.rays.dto.RateLimitDTO;

@Service
@Transactional
public class RateLimitServiceImpl extends BaseServiceImpl<RateLimitDTO, RateLimitDAOInt> implements RateLimitServiceInt{

}
