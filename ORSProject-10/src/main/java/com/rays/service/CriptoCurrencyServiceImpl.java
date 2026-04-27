package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CriptoCurrencyDAOInt;
import com.rays.dto.CriptoCurrencyDTO;

@Service
@Transactional
public class CriptoCurrencyServiceImpl extends BaseServiceImpl<CriptoCurrencyDTO, CriptoCurrencyDAOInt> implements CriptoCurrencyServiceInt{

}
