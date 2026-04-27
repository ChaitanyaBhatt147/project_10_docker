package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SLADAOInt;
import com.rays.dto.SLADTO;

@Service
@Transactional
public class SLAServiceImpl extends BaseServiceImpl<SLADTO, SLADAOInt> implements SLAServiceInt{

}
