package me.zhengjie.modules.system.service;

import me.zhengjie.base.CommonService;
import me.zhengjie.modules.system.domain.Template;

public interface TemplateService extends CommonService<Template> {
    String CACHE_KEY = "Template";

}
