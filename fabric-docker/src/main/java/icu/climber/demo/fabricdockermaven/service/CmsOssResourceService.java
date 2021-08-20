package icu.climber.demo.fabricdockermaven.service;

import icu.climber.demo.fabricdockermaven.model.CmsOssResource;

import java.util.List;

/**
 * @Description 资源云OSS信息
 * @Created by lipandeng on 2021/8/20
 */
public interface CmsOssResourceService {
    List<CmsOssResource> listOssResource(int pageIndex, int pageSize, long parentId,short parentType);
}
