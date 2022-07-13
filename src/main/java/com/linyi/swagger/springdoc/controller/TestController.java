package com.linyi.swagger.springdoc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linyi
 * @date 2022/7/13
 * 1.0
 */


@Tag(name="TestController",description ="测试springdoc使用")
@RestController
@RequestMapping("/hello")
public class TestController {


    //summary = "测试1" //接口用处
    // description = "测试返回数据的字符串" ：概述
    @Operation(summary = "测试1",description = "返回姓名")
    @GetMapping("/test1")
    public String test1(
            @Parameter(description="姓名") String name){
        return name;

    }

    @Operation(summary = "测试2",description = "返回年龄")
    @GetMapping("/test2/{age}")
    public int test2(
            @Parameter(description="性别")  @PathVariable("age") int age){
        return age;
    }

}
