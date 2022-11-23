package com.bkood.yuque.models.get;

import cn.hutool.http.HttpRequest;
import com.bkood.yuque.common.Config;
import com.bkood.yuque.common.RequestParameters;
import com.bkood.yuque.common.Result;
import com.bkood.yuque.entity.DocDetail;
import com.bkood.yuque.parameters.query.QueryReposDocParameters;

/**
 * 获取单篇文档的详细信息
 * <a href="https://www.yuque.com/yuque/developer/doc#684fb2c5">Doc</a>
 */
public class GetReposDoc implements RequestParameters<QueryReposDocParameters, Result<DocDetail>> {

    /**
     * 请求路径
     */
    public static final String URL = "/repos/{0}/docs/{1}";

    /**
     * 请求类
     */
    private final HttpRequest request;

    /**
     * 请求基础构造
     * @param namespace namespace（仓库的唯一名称）
     * @param slug 文档路径
     * @param config {@link Config} 配置
     */
    public GetReposDoc(String namespace, String slug, Config config) {
        this.request = HttpRequest.get(toUrl(config.getBaseUrl(), URL, namespace, slug));
        setConfigToRequest(this.request, config);
    }

    @Override
    public Result<DocDetail> run() {
        return new Result<>(execute(this.request), DocDetail.class);
    }
}
