# Spring Boot 整合 springdoc-openapi
## 更新区别：
* @Api -> @Tag
* @ApiIgnore -> @Parameter(hidden = true) or @Operation(hidden = true) or @Hidden
* @ApiImplicitParam -> @Parameter
* @ApiImplicitParams -> @Parameters
* @ApiModel -> @Schema
* @ApiModelProperty(hidden = true) -> @Schema(accessMode = READ_ONLY)
* @ApiModelProperty -> @Schema
* @ApiOperation(value = "foo", notes = "bar") -> @Operation(summary = "foo", description = "bar")
* @ApiParam -> @Parameter
* @ApiResponse(code = 404, message = "foo") -> @ApiResponse(responseCode = "404", description = "foo")

## 参考文档1：https://blog.csdn.net/wangzhihao1994/article/details/108408595?utm_source=app&app_version=5.4.0&utm_source=app
## 参考文档2：https://blog.csdn.net/wdjnb/article/details/123690666?utm_medium=distribute.pc_feed_404.none-task-blog-2~default~BlogCommendFromBaidu~Rate-4-123690666-blog-null.pc_404_mixedpudn&depth_1-utm_source=distribute.pc_feed_404.none-task-blog-2~default~BlogCommendFromBaidu~Rate-4-123690666-blog-null.pc_404_mixedpud
## github：https://github.com/wangzhihaolighter/spring-boot-notes/tree/master/spring-boot-example/E.tools/open-api/springdoc-openapi/src/main/java/com/example/spring/doc