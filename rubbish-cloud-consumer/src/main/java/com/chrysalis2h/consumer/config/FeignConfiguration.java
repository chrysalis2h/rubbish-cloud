package com.chrysalis2h.consumer.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FeignConfiguration
 * @Description: FeignConfiguration
 * @Author: HJ
 * @Date: 2021/2/22 20:39
 * @Version: v1.0 文件初始创建
 */
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerlevel() {
        return Logger.Level.FULL;
    }
}
