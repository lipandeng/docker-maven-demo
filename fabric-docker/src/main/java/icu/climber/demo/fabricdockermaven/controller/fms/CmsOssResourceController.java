package icu.climber.demo.fabricdockermaven.controller.fms;

import icu.climber.demo.fabricdockermaven.common.response.CommonPage;
import icu.climber.demo.fabricdockermaven.common.response.CommonResult;
import icu.climber.demo.fabricdockermaven.model.CmsOssResource;
import icu.climber.demo.fabricdockermaven.service.CmsOssResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description OSS资源管理
 * @Created by lipandeng on 2021/8/20
 */
@Api(tags = "OSS资源管理")
@RestController
@RequestMapping("cms/oss")
public class CmsOssResourceController {

    @Autowired
    private CmsOssResourceService cmsOssResourceService;

    @ApiOperation("根据父id分页查询云存储")
    @GetMapping("/list")
    public CommonResult<CommonPage<CmsOssResource>> getOssResourceList(@RequestParam(value = "pageIndex", defaultValue = "1")
                                                                       @ApiParam("页码") Integer pageIndex,
                                                                       @RequestParam(value = "pageSize", defaultValue = "10")
                                                                       @ApiParam("每页数量") Integer pageSize,
                                                                       @RequestParam("parentId")
                                                                       @ApiParam("父id") long parentId) {
        short parentType = 1;
        List<CmsOssResource> cmsOssResources = cmsOssResourceService.listOssResource(pageIndex, pageSize, parentId, parentType);
        return CommonResult.success(CommonPage.restPage(cmsOssResources));
    }
}
