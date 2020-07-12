package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>User Login</title>\r\n");
      out.write("    <!--bootstrap.min.css-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!--style.css-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <!--jquery.js-->\r\n");
      out.write("    <script src=\"js/jquery-3.4.1.js\"></script>\r\n");
      out.write("    <!--bootstrap.min.js-->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!--bootstrap-show-password.min.js-->\r\n");
      out.write("    <script src=\"js/bootstrap-show-password.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 登录 -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!-- 左 -->\r\n");
      out.write("        <div class=\"col-sm-6\">\r\n");
      out.write("            <!-- 左侧图片 -->\r\n");
      out.write("            <div class=\"sign-bgleft\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 右 -->\r\n");
      out.write("        <div class=\"col-sm-6\">\r\n");
      out.write("            <div class=\"sign-content\">\r\n");
      out.write("                <h2>登录</h2>\r\n");
      out.write("                <!-- 登录表单 -->\r\n");
      out.write("                <div class=\"signin-form\">\r\n");
      out.write("                    <form id=\"userLoginInfo\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>用户名</label>\r\n");
      out.write("                        <input type=\"text\" name=\"userName\" id=\"username\" onblur=\"test();\" class=\"form-control\" placeholder=\"请输入用户名\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"username-test\" style=\"height: 30px\">\r\n");
      out.write("                        <span id=\"username-span\">❕请输入6-18位字符，又英文数字下划线组成！</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>密码</label>\r\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" placeholder=\"请输入密码\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- 记住密码 -->\r\n");
      out.write("                <div class=\"signin-password\">\r\n");
      out.write("                    <div class=\"checkbox-list\">\r\n");
      out.write("                        <ul class=\"list\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <input class=\"password-checkbox\" type=\"checkbox\">\r\n");
      out.write("                                <label id=\"label-checkbox\">记住密码!</label>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">忘记密码?</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- 登录按钮 -->\r\n");
      out.write("                <div class=\"signin-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn signin_btn\" onclick=\"login()\">登录</button>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        没有账号? 立即注册!\r\n");
      out.write("                        <a href=\"signup.html\">注册</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    $(\"#password\").password({\r\n");
      out.write("    });\r\n");
      out.write("    $('#password').password('show');\r\n");
      out.write("    $('#password').password('hide');\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //用户名验证\r\n");
      out.write("    var isYES ;\r\n");
      out.write("    function test() {\r\n");
      out.write("        var username = document.getElementById('username');\r\n");
      out.write("        var usernamespan = document.getElementById('username-span');\r\n");
      out.write("\r\n");
      out.write("        var uservalue = username.value;\r\n");
      out.write("        if (uservalue.length < 6 || uservalue.length >18){\r\n");
      out.write("            usernamespan.innerHTML = '❌请输入6-18个字符！';\r\n");
      out.write("            isYES=false;\r\n");
      out.write("        }else{\r\n");
      out.write("            for (var i = 0; i < uservalue.length; i++){\r\n");
      out.write("                if (!isDEF(uservalue[i])){\r\n");
      out.write("                    isYES = false;\r\n");
      out.write("                    break;\r\n");
      out.write("                }\r\n");
      out.write("                isYES=true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if (isYES){\r\n");
      out.write("                usernamespan.innerHTML = '✔你的账号可以使用！';\r\n");
      out.write("            }else {\r\n");
      out.write("                usernamespan.innerHTML = '❌必须使用英文字母数字下划线！';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    // 判断是不是英文字母下划线\r\n");
      out.write("    function isDEF(charstr) {\r\n");
      out.write("        if (charstr >= 'a' && charstr <= 'z' || charstr >= 'A' && charstr <= 'Z'|| charstr >= 0 && charstr <= 9|| charstr == '_'){\r\n");
      out.write("            return true;\r\n");
      out.write("        }else {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function login() {\r\n");
      out.write("        if (isYES == true){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url:'user/login',\r\n");
      out.write("                type:'post',\r\n");
      out.write("                async:false,     //设置同步才可保存、操作数据\r\n");
      out.write("                data:new FormData($(\"#userLoginInfo\")[0]),\r\n");
      out.write("                cache:false,\r\n");
      out.write("                processData: false,   // jQuery不去处理发送的数据\r\n");
      out.write("                contentType : false,  //jQuery不去处理表头\r\n");
      out.write("                success: function (result) {\r\n");
      out.write("                    if(result !=null && result.success){\r\n");
      out.write("                        alert(\"Login success!\");\r\n");
      out.write("                        window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\"+\"main\";\r\n");
      out.write("                    }\r\n");
      out.write("                else{\r\n");
      out.write("                        alert(\"tips:  \"+result.message);\r\n");
      out.write("                        isYES=false;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
