package com.chrysalis2h.consumer.hystrix;

import com.chrysalis2h.consumer.client.RubbishClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: RubbishHystrix
 * @Description:
 * 0.
 * 1. 断路器机制：失败超过一定数量->开路->半开路->正常或开路
 * 2. Fallback：降级操作。对于查询来说可以设置默认值或者来自缓存
 * 3. 资源隔离：
 * @Author: HeJin
 * @Date: 2021\3\16 0016 16:36
 * @Version: v1.0 文件初始创建
 */
@Component
public class RubbishHystrix implements RubbishClient {

    @Override
    public String getRubbish(@RequestParam(required = false) String name) {
        return name + " can not reached";
    }
}
