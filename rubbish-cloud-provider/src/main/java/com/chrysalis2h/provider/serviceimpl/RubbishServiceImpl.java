package com.chrysalis2h.provider.serviceimpl;

import com.chrysalis2h.provider.service.IRubbishService;
import org.springframework.stereotype.Service;

@Service
public class RubbishServiceImpl implements IRubbishService {

    @Override
    public String productRubbish(String name) {
        System.out.println("this is service test");
        return "rubbish " + name;
    }

}
