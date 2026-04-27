package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dto.SubscriptionPlanDAOInt;
import com.rays.dto.SubscriptionPlanDTO;

@Service
@Transactional
public class SubscriptionPlanServiceImpl extends BaseServiceImpl<SubscriptionPlanDTO, SubscriptionPlanDAOInt> implements SubscriptionPlanServiceInt{

}
