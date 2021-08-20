package icu.climber.demo.fabricdockermaven.mapper;


import icu.climber.demo.fabricdockermaven.model.CmsOssResource;
import icu.climber.demo.fabricdockermaven.model.CmsOssResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsOssResourceMapper {
    int countByExample(CmsOssResourceExample example);

    int deleteByExample(CmsOssResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsOssResource record);

    int insertSelective(CmsOssResource record);

    List<CmsOssResource> selectByExample(CmsOssResourceExample example);

    CmsOssResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsOssResource record, @Param("example") CmsOssResourceExample example);

    int updateByExample(@Param("record") CmsOssResource record, @Param("example") CmsOssResourceExample example);

    int updateByPrimaryKeySelective(CmsOssResource record);

    int updateByPrimaryKey(CmsOssResource record);
}