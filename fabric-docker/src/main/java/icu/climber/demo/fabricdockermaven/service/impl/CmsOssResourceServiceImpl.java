package icu.climber.demo.fabricdockermaven.service.impl;

import com.github.pagehelper.PageHelper;
import icu.climber.demo.fabricdockermaven.mapper.CmsOssResourceMapper;
import icu.climber.demo.fabricdockermaven.model.CmsOssResource;
import icu.climber.demo.fabricdockermaven.model.CmsOssResourceExample;
import icu.climber.demo.fabricdockermaven.service.CmsOssResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Created by lipandeng on 2021/8/20
 */
@Service
public class CmsOssResourceServiceImpl implements CmsOssResourceService {
    @Autowired
    private CmsOssResourceMapper cmsOssResourceMapper;
    @Override
    public List<CmsOssResource> listOssResource(int pageIndex, int pageSize, long parentId,short parentType) {
        PageHelper.startPage(pageIndex,pageSize);
        CmsOssResourceExample cmsOssResourceExample = new CmsOssResourceExample();
        cmsOssResourceExample.or().andParentIdEqualTo(parentId).andParentTypeEqualTo(parentType);
        cmsOssResourceExample.setOrderByClause("sort_num asc");
        return cmsOssResourceMapper.selectByExample(cmsOssResourceExample);
    }
}
