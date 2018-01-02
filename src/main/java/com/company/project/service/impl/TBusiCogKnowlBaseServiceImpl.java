package com.company.project.service.impl;

import com.company.project.dao.TBusiCogKnowlBaseMapper;
import com.company.project.model.TBusiCogKnowlBase;
import com.company.project.service.TBusiCogKnowlBaseService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by RichCodeAI on 2018/01/02.
 */
@Service
@Transactional
public class TBusiCogKnowlBaseServiceImpl extends AbstractService<TBusiCogKnowlBase> implements TBusiCogKnowlBaseService {
    @Resource
    private TBusiCogKnowlBaseMapper tBusiCogKnowlBaseMapper;

}
