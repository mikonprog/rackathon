package com.example.rackathon.engine;

import java.util.logging.*;
import org.springframework.stereotype.*;
import org.springframework.web.client.*;

@Service
public class ApiService {

    private static final Logger logger = Logger.getLogger(Logger.class.getName());

    public String consume(String uri) {

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        logger.info(result);

        return result;

    }

}
