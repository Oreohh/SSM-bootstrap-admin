package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class online_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("    <!-- 响应式设置viewport -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 标题 -->\r\n");
      out.write("    <title>在线设备管理</title>\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap JS -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- 样式 CSS-->\r\n");
      out.write("    <link href=\"css/online.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1 class=\"page-header\">在线设备管理</h1>\r\n");
      out.write("    <div class=\"row devices\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 编辑Modal 弹窗窗口 -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModalupdate\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span>&times;</span><span class=\"sr-only\">关闭弹窗</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabeupdate\">设备运行信息</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=test class=\"modal-body\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    //查询记录\r\n");
      out.write("    function show(id){\r\n");
      out.write("        // $(\"#editdev\")[0].reset();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            data:{\"devId\":id},\r\n");
      out.write("            url:\"listDeviceFiled\",\r\n");
      out.write("\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            success:function(result){\r\n");
      out.write("                var html = \"<p><span>设备id:\"+id+\"</p>\";\r\n");
      out.write("                if(result!=null) {\r\n");
      out.write("                    result.dataObject.forEach((item, index) => {\r\n");
      out.write("                        console.log(item);\r\n");
      out.write("                        html += \"<p><span>\" + item.filedKey + \":</span>\" + item.filedValue + \"</p>\";\r\n");
      out.write("                        $('#test').html(html);\r\n");
      out.write("                    })\r\n");
      out.write("                }else {alert(\"tips: 查询属性失败\")}\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("onlineList");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"device\">\r\n");
          out.write("                <div class=\"img-hover\">\r\n");
          out.write("                    <img class=\"img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-toggle=\"modal\" data-target=\"#myModalupdate\" onmouseover=\"show('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">\r\n");
          out.write("                </div>\r\n");
          out.write("                <table class=\"table\">\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>设备ID：</th>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>设备类型：</th>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.sDevType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>设备编号：</th>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.devNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>设备名称：</th>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.devName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>设备状态：</th>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onlineList.devStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>操作：</th>\r\n");
          out.write("                        <td>\r\n");
          out.write("                            <button type=\"button\" class=\"btn btn-success\" >打开</button>\r\n");
          out.write("                            <button type=\"button\" class=\"btn btn-danger\" >关闭</button>\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                </table>\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
