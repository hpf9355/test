package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/*
页面请求参数实体类
 */
@Data
public class QueryPageRequest extends RequestData {

    private String siteId;//站点id
    private String pageId;//页面id
    private String pageName;//页面名称
    private String templateId;//模板id
    private String pageAliase;//别名
}
