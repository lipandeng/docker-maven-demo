package icu.climber.demo.fabricdockermaven.service;

import icu.climber.demo.fabricdockermaven.model.FmsFolder;

import java.util.List;

/**
 * @Description 文件夹管理
 * @Created by lipandeng on 2021/8/19
 */
public interface FmsFolderService {
    /**
     * 根据创建者和父id查询文件夹
     *
     * @param cratorId
     * @param parentId
     * @return
     */
    List<FmsFolder> listFolder(long cratorId, long parentId);
}
