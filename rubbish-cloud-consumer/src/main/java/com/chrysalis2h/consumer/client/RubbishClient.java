package com.chrysalis2h.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: RubbishClient
 * @Description: 通过Feign远程调用服务
 * name:服务ID
 * value:同name，服务ID
 * url: 服务URL地址，一般用于测试
 * path:路径前缀
 * qualifier:指定服务名称，避免服务接口有多个实例，不能根据类型注入
 * fallback: 指定容错处理类，并且fallback指定的类必须实现@FeignClient注解的接口
 * fallbackFactory: 工厂类，用于生成fallback类实例，可以实现每个接口通用的容错逻辑，减少重复的代码
 * @Author: HJ
 * @Date: 2021/2/22 20:38
 * @Version: v1.0 文件初始创建
 */
@FeignClient(name = "rubbish-cloud-provider", path = "/rubbish")
public interface RubbishClient {
    @RequestMapping("/getRubbish")
    @ResponseBody
    String getRubbish();

}
