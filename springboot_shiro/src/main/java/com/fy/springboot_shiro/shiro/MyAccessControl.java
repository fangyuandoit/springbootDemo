package com.fy.springboot_shiro.shiro;

import com.fy.springboot_shiro.utils.ResultUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/11 15:57
 * @Description:   如果需要可以定义自己的AccessControl
 */
@Deprecated
public class MyAccessControl extends AccessControlFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        System.err.println("----------------------------------isAccessAllowed");
        System.err.println(o);

//        Subject subject = getSubject(servletRequest,servletResponse);
        String url = getPathWithinApplication(servletRequest);
        System.out.println(url);
        if(url.contains("/login.html")){
                return true;
        }else{
            Subject subject = getSubject(servletRequest, servletResponse);
            return subject.getPrincipal() != null;
        }
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        System.err.println("-----------------------------------onAccessDenied");
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpServletResponse response = WebUtils.toHttp(servletResponse);
        response.getOutputStream().write(ResultUtils.fail("","302").toJSONString().getBytes());

        return false;
    }
}
