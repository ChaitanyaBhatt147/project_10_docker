package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LoanDAOInt;
import com.rays.dto.LoanDTO;

@Service
@Transactional
public class LoanServiceImpl extends BaseServiceImpl<LoanDTO, LoanDAOInt> implements LoanServiceint{

}
