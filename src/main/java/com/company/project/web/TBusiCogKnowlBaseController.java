package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TBusiCogKnowlBase;
import com.company.project.service.TBusiCogKnowlBaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.List;

/**
* Created by RichCodeAI on 2018/01/02.
*/
@RestController
@RequestMapping("/t/busi/cog/knowl/base")
public class TBusiCogKnowlBaseController {
    @Resource
    private TBusiCogKnowlBaseService tBusiCogKnowlBaseService;

    @PostMapping("/add")
    public Result add(TBusiCogKnowlBase tBusiCogKnowlBase) {
        tBusiCogKnowlBaseService.save(tBusiCogKnowlBase);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tBusiCogKnowlBaseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TBusiCogKnowlBase tBusiCogKnowlBase) {
        tBusiCogKnowlBaseService.update(tBusiCogKnowlBase);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TBusiCogKnowlBase tBusiCogKnowlBase = tBusiCogKnowlBaseService.findById(id);
        return ResultGenerator.genSuccessResult(tBusiCogKnowlBase);
    }

    //@PostMapping("/list")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TBusiCogKnowlBase> list = tBusiCogKnowlBaseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
