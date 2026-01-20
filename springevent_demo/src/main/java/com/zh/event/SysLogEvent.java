package com.zh.event;

import com.zh.dto.OptLogDTO;
import org.springframework.context.ApplicationEvent;
/**
 * 定义系统日志事件
 */
public class SysLogEvent extends ApplicationEvent {
    public SysLogEvent(OptLogDTO optLogDTO) {
        super(optLogDTO);
    }
}
