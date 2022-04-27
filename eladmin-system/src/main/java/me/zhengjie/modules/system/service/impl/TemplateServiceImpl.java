package me.zhengjie.modules.system.service.impl;

import lombok.AllArgsConstructor;
import me.zhengjie.base.CommonServiceImpl;
import me.zhengjie.modules.system.domain.Template;
import me.zhengjie.modules.system.service.TemplateService;
import me.zhengjie.modules.system.service.mapper.TemplateMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class TemplateServiceImpl extends CommonServiceImpl<TemplateMapper, Template> implements TemplateService {



}
