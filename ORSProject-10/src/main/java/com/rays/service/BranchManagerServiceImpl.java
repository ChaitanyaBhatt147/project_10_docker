package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BranchManagerDAOInt;
import com.rays.dto.BranchManagerDTO;

@Service
@Transactional
public class BranchManagerServiceImpl extends BaseServiceImpl<BranchManagerDTO, BranchManagerDAOInt> implements BranchManagerServiceInt{

}
