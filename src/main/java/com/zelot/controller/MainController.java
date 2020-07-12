package com.zelot.controller;

import com.zelot.ModelDo.Device;
import com.zelot.ModelDo.User;
import com.zelot.Support.Contants;
import com.zelot.Support.Eunums.RoleEnum;
import com.zelot.Support.Result;
import com.zelot.Support.ResultSupport;
import com.zelot.annotations.Permissions;
import com.zelot.dao.DeviceDao;
import com.zelot.service.DevService;
import com.zelot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class MainController {
    //2个主页面

    @Autowired
    UserService userService;
    @Autowired
    DevService devService;

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @RequestMapping("/login")
    public String login(){return "login";}

    @RequestMapping("/appSimulation")
    @Permissions(role = {RoleEnum.ADMIN, RoleEnum.NORMAL})
    public String app(Model model){
        List<Device> devices = devService.selectAll();
        List<Device> onlineDev = null;
        onlineDev = devices.stream()
                .filter((Device dev)->dev.getDevStatus().equals(true))
                .collect(Collectors.toList());
        model.addAttribute("onlineList",onlineDev);
        return "online";
    }


    @RequestMapping("/user/login")
    @ResponseBody
    //使用服务器session和cookie机制验证用户是否登录
    @Permissions(role = {RoleEnum.ADMIN, RoleEnum.NORMAL})
    public Result<Void> login(@RequestParam(value = "userName",required = true)String userName,
                              @RequestParam(value = "password",required = true)String password,
                              HttpServletRequest request){
        User user = userService.userLogin(userName,password);
        System.out.println(userName+"  Login!");
        Result<Void> result= new ResultSupport<Void>(true);
        if(user == null){
            result.setSuccess(false);
            result.setMessage("用户名或密码有误");
        }else {
            HttpSession session = request.getSession();
            session.setAttribute(Contants.USER_SESSION,user);
        }
        return  result;
    }

    @RequestMapping("/user/logout")
    @Permissions(role = {RoleEnum.ADMIN, RoleEnum.NORMAL})
    public  String logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //清除session
        request.getSession().removeAttribute(Contants.USER_SESSION);
        return "redirect:login";
    }
}
