package com.zelot.Interceptor;

import com.zelot.ModelDo.User;
import com.zelot.Support.Contants;
import com.zelot.Support.Eunums.RoleEnum;
import com.zelot.annotations.Permissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;


public class Authinterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(Authinterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        logger.info("权限拦截！");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(Contants.USER_SESSION);
        HandlerMethod methodHandle = (HandlerMethod) handler;
        Method method = methodHandle.getMethod();
        Permissions permissions = method.getAnnotation(Permissions.class);
        for (RoleEnum roleEnum : permissions.role()){
            if (roleEnum.name().equals(user.getRoleKey())){
                return true;
            }
        }
        return false;
    }
}
