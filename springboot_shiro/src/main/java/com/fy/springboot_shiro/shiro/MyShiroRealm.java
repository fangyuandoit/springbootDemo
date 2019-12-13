package com.fy.springboot_shiro.shiro;

import com.fy.springboot_shiro.dao.UserDao;
import com.fy.springboot_shiro.entiry.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/4 16:26
 * @Description:
 */
public class MyShiroRealm extends AuthorizingRealm {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserDao userDao;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) principals.getPrimaryPrincipal();
        logger.info(String.format("用户 %s 权限认证", user.getAccount()));
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userDao.selectRoleByAccount(user));
        authorizationInfo.setStringPermissions(userDao.selectPermissionByAccount(user));
        return authorizationInfo;
    }


    /*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String account = token.getPrincipal() + "";
        String password = new String((char[]) token.getCredentials());
        logger.info("用户" + account + "登录认证-----ShiroRealm.doGetAuthenticationInfo");
        User user = userDao.selectUserByAccount(account);
        if (user == null) {
            throw new UnknownAccountException("用户名错误！");
        }
        if (!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("用户名或密码错误！");
        }
        //  AuthenticationInfo authcInfo =new SimpleAuthenticationInfo(user,user.getPassword(),salt,"xx");   // 加盐加密码的验证
        AuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
        return info;
    }
}
