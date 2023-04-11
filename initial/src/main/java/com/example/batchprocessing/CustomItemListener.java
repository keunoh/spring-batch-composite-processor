package com.example.batchprocessing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.annotation.OnReadError;

public class CustomItemListener {
    private static final Log logger = LogFactory.getLog(CustomItemListener.class);

    @OnReadError
    public void onReadError(Exception e){
        logger.error("에러 발생한 구간", e);
    }
}
