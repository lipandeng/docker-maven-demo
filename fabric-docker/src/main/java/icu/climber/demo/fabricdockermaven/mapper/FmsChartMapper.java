package icu.climber.demo.fabricdockermaven.mapper;


import icu.climber.demo.fabricdockermaven.model.FmsChart;
import icu.climber.demo.fabricdockermaven.model.FmsChartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmsChartMapper {
    int countByExample(FmsChartExample example);

    int deleteByExample(FmsChartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FmsChart record);

    int insertSelective(FmsChart record);

    List<FmsChart> selectByExample(FmsChartExample example);

    FmsChart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FmsChart record, @Param("example") FmsChartExample example);

    int updateByExample(@Param("record") FmsChart record, @Param("example") FmsChartExample example);

    int updateByPrimaryKeySelective(FmsChart record);

    int updateByPrimaryKey(FmsChart record);
}