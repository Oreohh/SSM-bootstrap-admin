/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.51
 * Generated at: 2020-06-02 08:53:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class device_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/gradle-6.2.2/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("file:/E:/gradle-6.2.2/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar", Long.valueOf(1585462877289L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("    <!-- 响应式设置viewport -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>设备管理</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- CDN -->\r\n");
      out.write("    <!-- 新 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("    <link href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap JS -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src =\"js/common.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2 class=\"sub-header\">设备列表</h2>\r\n");
      out.write("<form class=\"form-inline\">\r\n");
      out.write("    <!-- 查询 -->\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label>设备ID：</label>\r\n");
      out.write("        <form id=\"show-id\">\r\n");
      out.write("        <input id=\"query\" name=\"id\" type=\"text\" class=\"form-control\" placeholder=\"输入设备ID\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <!-- /查询 -->\r\n");
      out.write("        <!-- 添加 -->\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#myModal0\" onclick=\"deviceBack()\">查询</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#myModal1\">新增设备</button>\r\n");
      out.write("        <!-- /添加 -->\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!-- 编辑Modal 弹窗窗口 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal0\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                    <span>&times;</span><span class=\"sr-only\">关闭弹窗</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">查询结果</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"showDevInfo\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备ID：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevId\" name=\"id\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备编号：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevNo\" name=\"devNo\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备名：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevName\" name=\"devName\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备购入时间：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevBuydate\" name=\"devBuydate\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备保修时间：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevWarrantydate\" name=\"devWarrantydate\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备状态：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevStatus\" name=\"devStatus\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备创建时间：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevCreate\" name=\"dateCreate\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>近次维修时间：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevRepairdate\" name=\"devRepairdate\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>近次更新时间：</label>\r\n");
      out.write("                        <input type=\"text\" id=\"showDevUpdate\" name=\"dateUpdate\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 添加Modal 弹窗窗口 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal1\" >\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                    <span>&times;</span><span class=\"sr-only\">关闭弹窗</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLab1\">添加设备</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"addDevInfo\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>设备编号：</label>\r\n");
      out.write("                    <input id=\"addDevNo\" name=\"devNo\" type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>设备名：</label>\r\n");
      out.write("                    <input id=\"addDevName\" name=\"devName\" type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>设备类型：</label>\r\n");
      out.write("                        <input id=\"addDevType\" name=\"devType\" type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>设备状态：</label>\r\n");
      out.write("                    <input id=\"addDevStatus\" name=\"devStatus\" type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>设备购入时间：</label>\r\n");
      out.write("                    <input id=\"addDevBuyDate\" name=\"devBuydate\" type=\"date\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>设备保修截止日期：</label>\r\n");
      out.write("                    <input id=\"addDevWarrantyDate\" name=\"devWarrantydate\" type=\"date\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" onclick=\"send()\">添加</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 列表 -->\r\n");
      out.write("<div class=\"table-responsive\">\r\n");
      out.write("    <table class=\"table table-striped\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>设备ID</th>\r\n");
      out.write("            <th>设备编号</th>\r\n");
      out.write("            <th>设备名</th>\r\n");
      out.write("            <th>设备类型</th>\r\n");
      out.write("            <th>购入时间</th>\r\n");
      out.write("            <th>保修日期</th>\r\n");
      out.write("            <th>设备状态</th>\r\n");
      out.write("            <th>创建时间</th>\r\n");
      out.write("            <th>近次维修时间</th>\r\n");
      out.write("            <th>更新时间</th>\r\n");
      out.write("            <th>操作</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("    <tbody id=\"result\" >\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function send() {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"device/add\",\r\n");
      out.write("            type: 'post',\r\n");
      out.write("            data:new FormData($(\"#addDevInfo\")[0]),\r\n");
      out.write("            cache:false,\r\n");
      out.write("            contentType:false,\r\n");
      out.write("            processData:false,\r\n");
      out.write("            success(){\r\n");
      out.write("                alert(\"add success!\")\r\n");
      out.write("                window.location.reload();\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateBack(id){\r\n");
      out.write("        $(\"#updateDevInfo\")[0].reset();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"device/edit\",\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            data:{\"id\":id},\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                $(\"#editId\").val(data.id);\r\n");
      out.write("                $(\"#editDevNo\").val(data.devNo);\r\n");
      out.write("                $(\"#editDevName\").val(data.devName);\r\n");
      out.write("                $(\"#editDevStatus\").val(data.devStatus);\r\n");
      out.write("                $('#editDevRepairDate').val(data.devRepairdate);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateDevice(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            data:new FormData($(\"#updateDevInfo\")[0]),\r\n");
      out.write("            url:\"device/update\",\r\n");
      out.write("            cache:false,\r\n");
      out.write("            contentType:false,\r\n");
      out.write("            processData:false,\r\n");
      out.write("            success:function(){\r\n");
      out.write("                alert(\"修改成功!\");\r\n");
      out.write("                window.location.reload();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deleteBack(id){\r\n");
      out.write("        $(\"#deleteId\")[0].reset();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            data:{\"id\":id},\r\n");
      out.write("            url:\"device/edit\",\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                $(\"#idDelete\").val(data.id);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deleteDevice(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            data:new FormData($(\"#deleteId\")[0]),\r\n");
      out.write("            url:\"device/delete\",\r\n");
      out.write("            cache:false,\r\n");
      out.write("            contentType:false,\r\n");
      out.write("            processData:false,\r\n");
      out.write("            success:function(){\r\n");
      out.write("                alert(\"删除成功!\");\r\n");
      out.write("                window.location.reload();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deviceBack(){\r\n");
      out.write("        $(\"#showDevInfo\")[0].reset();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            data:{id: $('#query').val()},\r\n");
      out.write("            url:\"device/edit\",\r\n");
      out.write("            dataType:'json',\r\n");
      out.write("            success:function (data){\r\n");
      out.write("                $(\"#showDevId\").val(data.id);\r\n");
      out.write("                $(\"#showDevNo\").val(data.devNo);\r\n");
      out.write("                $('#showDevName').val(data.devName);\r\n");
      out.write("                $('#showDevBuydate').val(data.devBuydate);\r\n");
      out.write("                $('#showDevWarrantydate').val(data.devWarrantydate);\r\n");
      out.write("                $('#showDevStatus').val(data.devStatus);\r\n");
      out.write("                $('#showDevCreate').val(data.dateCreate);\r\n");
      out.write("                $('#showDevRepairdate').val(data.devRepairdate);\r\n");
      out.write("                $('#showDevUpdate').val(data.dateUpdate);\r\n");
      out.write("        }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/device.jsp(175,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/device.jsp(175,8) '${devlist}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${devlist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/jsp/device.jsp(175,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("devList");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        <tr>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.devNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.devName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.sDevType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.devBuydate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.devWarrantydate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.devStatus eq true ? \"在线\":\"离线\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.dateCreate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.devRepairdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.dateUpdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td>\r\n");
            out.write("                <button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#myModal2\" onclick=\"updateBack(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">编辑</button>\r\n");
            out.write("                <!-- 编辑Modal 弹窗窗口 -->\r\n");
            out.write("                <div class=\"modal fade\" id=\"myModal2\">\r\n");
            out.write("                    <div class=\"modal-dialog\">\r\n");
            out.write("                        <div class=\"modal-content\">\r\n");
            out.write("                            <div class=\"modal-header\">\r\n");
            out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
            out.write("                                    <span>&times;</span><span class=\"sr-only\">关闭弹窗</span>\r\n");
            out.write("                                </button>\r\n");
            out.write("                                <h4 class=\"modal-title\" id=\"myModalLabel\">编辑信息</h4>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"modal-body\">\r\n");
            out.write("                                <form id=\"updateDevInfo\">\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>设备ID：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"editId\" name=\"id\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\">\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>设备编号：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"editDevNo\" name=\"devNo\" class=\"form-control\" placeholder=\"\">\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>设备名：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"editDevName\" name=\"devName\" class=\"form-control\" placeholder=\"\">\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>设备类型：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"editDevType\" name=\"devType\" class=\"form-control\" placeholder=\"\">\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>设备状态：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"editDevStatus\" name=\"devStatus\" class=\"form-control\" placeholder=\"\">\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>近次维修时间：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"editDevRepairDate\" name=\"devRepairdate\" class=\"form-control\" placeholder=\"\">\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                </form>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"modal-footer\">\r\n");
            out.write("                                <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\">关闭</button>\r\n");
            out.write("                                <button type=\"submit\" class=\"btn btn-primary\" onclick=\"updateDevice()\">保存</button>\r\n");
            out.write("                            </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                </div>\r\n");
            out.write("\r\n");
            out.write("                <button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#myModal3\"\r\n");
            out.write("                        onclick=\"deleteBack(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devList.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">删除</button>\r\n");
            out.write("                <!-- 删除Modal 弹窗窗口 -->\r\n");
            out.write("                <div class=\"modal fade\" id=\"myModal3\">\r\n");
            out.write("                    <div class=\"modal-dialog\">\r\n");
            out.write("                        <div class=\"modal-content\">\r\n");
            out.write("                            <div class=\"modal-header\">\r\n");
            out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
            out.write("                                    <span>&times;</span><span class=\"sr-only\">关闭弹窗</span>\r\n");
            out.write("                                </button>\r\n");
            out.write("                                <h4 class=\"modal-title\" id=\"myModalLabel\">删除信息</h4>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"modal-body\">\r\n");
            out.write("                                <form id=\"deleteId\">\r\n");
            out.write("                                    <div class=\"form-group\">\r\n");
            out.write("                                        <label>当前设备ID：</label>\r\n");
            out.write("                                        <input type=\"text\" id=\"idDelete\" name=\"id\" class=\"form-control\" placeholder=\"\" readonly=\"readonly\"/>\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                </form>\r\n");
            out.write("                                <span>是否确认删除设备信息？</span>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"modal-footer\">\r\n");
            out.write("                                <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\">关闭</button>\r\n");
            out.write("                                <button type=\"submit\" class=\"btn btn-primary\" onclick=\"deleteDevice()\">删除</button>\r\n");
            out.write("                            </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                </div>\r\n");
            out.write("            </td>\r\n");
            out.write("        </tr>\r\n");
            out.write("        </tbody>\r\n");
            out.write("        <!-- /列表 -->\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
