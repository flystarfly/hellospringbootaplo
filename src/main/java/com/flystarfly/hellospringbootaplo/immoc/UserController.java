package com.flystarfly.hellospringbootaplo.immoc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 002941
 * @description TODO
 * @date 2018/10/25 13:47
 * @since 1.0.0
 **/
@RequestMapping("user")
@RestController
public class UserController {

    @Resource
   private UserServiceBo userServiceBo;

    /**
     * @author 002941
     * @description //新增
     * @date  2018/10/25 13:48
     * @param valuess
     * @return JsonResult
     * @since 1.0.0
     **/
    @RequestMapping("/add")
    @ResponseBody
    public JsonResult add(@RequestBody int valuess) {

        JsonResult result = JsonResult.getInstance();
        userServiceBo.add();
        return result;
    }



}
