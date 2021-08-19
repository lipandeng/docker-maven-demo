package icu.climber.demo.fabricdockermaven.service.impl;

import icu.climber.demo.fabricdockermaven.mapper.FmsFolderMapper;
import icu.climber.demo.fabricdockermaven.model.FmsFolder;
import icu.climber.demo.fabricdockermaven.model.FmsFolderExample;
import icu.climber.demo.fabricdockermaven.service.FmsFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Created by lipandeng on 2021/8/19
 */
@Service
public class FmsFolderServiceImpl implements FmsFolderService {

    @Autowired
    private FmsFolderMapper fmsFolderMapper;

    @Override
    public List<FmsFolder> listFolder(long cratorId, long parentId) {
        FmsFolderExample fmsFolderExample = new FmsFolderExample();
        fmsFolderExample.or().andCreatorIdEqualTo(cratorId).andParentIdEqualTo(parentId);
        return fmsFolderMapper.selectByExample(fmsFolderExample);
    }
}
