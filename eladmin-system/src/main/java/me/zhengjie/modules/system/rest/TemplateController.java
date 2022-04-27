package me.zhengjie.modules.system.rest;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.zhengjie.modules.system.service.TemplateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/template")
@RequiredArgsConstructor
@Api(tags = "学业信息统计管理")
public class TemplateController {

    private final TemplateService templateService;
}
