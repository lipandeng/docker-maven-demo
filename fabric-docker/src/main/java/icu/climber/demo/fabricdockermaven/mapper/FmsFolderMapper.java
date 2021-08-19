package icu.climber.demo.fabricdockermaven.mapper;


import icu.climber.demo.fabricdockermaven.model.FmsFolder;
import icu.climber.demo.fabricdockermaven.model.FmsFolderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmsFolderMapper {
    int countByExample(FmsFolderExample example);

    int deleteByExample(FmsFolderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FmsFolder record);

    int insertSelective(FmsFolder record);

    List<FmsFolder> selectByExample(FmsFolderExample example);

    FmsFolder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FmsFolder record, @Param("example") FmsFolderExample example);

    int updateByExample(@Param("record") FmsFolder record, @Param("example") FmsFolderExample example);

    int updateByPrimaryKeySelective(FmsFolder record);

    int updateByPrimaryKey(FmsFolder record);
}