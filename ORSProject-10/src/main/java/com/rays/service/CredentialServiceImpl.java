package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CredentialDAOInt;
import com.rays.dto.CredentialDTO;

@Service
@Transactional
public class CredentialServiceImpl extends BaseServiceImpl<CredentialDTO, CredentialDAOInt> implements CredentialServiceInt{

}
