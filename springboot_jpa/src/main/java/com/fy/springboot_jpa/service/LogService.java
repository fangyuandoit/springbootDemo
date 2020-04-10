package com.fy.springboot_jpa.service;

import com.fy.springboot_jpa.model.entity.Log;
import com.fy.springboot_jpa.service.base.CrudService;
import org.springframework.data.domain.Page;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/18 13:59
 * @Description:
 */
public interface LogService extends CrudService<Log, Long> {

    /**
     * Lists latest logs.
     *
     * @param top top number must not be less than 0
     * @return a page of latest logs
     */
    Page<Log> pageLatest(int top);

}
