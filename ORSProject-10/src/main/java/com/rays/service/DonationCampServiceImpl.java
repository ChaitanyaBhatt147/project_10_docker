package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DonationCampDAOInt;
import com.rays.dto.DonationCampDTO;

@Service
@Transactional
public class DonationCampServiceImpl extends BaseServiceImpl<DonationCampDTO, DonationCampDAOInt> implements DonationCampServiceInt{

}
