package com.zh.listener;

import com.zh.dto.OptLogDTO;
import com.zh.event.SysLogEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步监听日志事件
 */

@Component
public class SysLogListener {

    @Async //异步处理
    @EventListener(SysLogEvent.class)
    public void saveSysLog(SysLogEvent event) {
        OptLogDTO sysLogDTO = (OptLogDTO) event.getSource();
        long id = Thread.currentThread().getId();
        System.out.println("监听到日志操作事件: "+sysLogDTO+"线程id: "+id);
    }
}
