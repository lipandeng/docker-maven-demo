package icu.climber.demo.fabricdockermaven.controller.fms;

import icu.climber.demo.fabricdockermaven.common.response.CommonResult;
import icu.climber.demo.fabricdockermaven.model.FmsFolder;
import icu.climber.demo.fabricdockermaven.service.FmsFolderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description folder相关接口
 * @Created by lipandeng on 2021/8/19
 */
@Api(tags = "文件夹相关接口")
@RestController
@RequestMapping("/pms/folder")
public class FmsFolderController {
    @Autowired
    private FmsFolderService fmsFolderService;

    @ApiOperation("查询文件夹列表")
    @GetMapping("/list")
    public CommonResult<List<FmsFolder>> getFolderList(@RequestParam("parentId") long parentId) {
        //创建者ID
        long creatorId = 1;
        List<FmsFolder> fmsFolders = fmsFolderService.listFolder(creatorId, parentId);
        return CommonResult.success(fmsFolders);
    }

}
