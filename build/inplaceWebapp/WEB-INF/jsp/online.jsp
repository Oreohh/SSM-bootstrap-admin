<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <base href="${pageContext.request.contextPath}/">
    <!-- 响应式设置viewport -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 标题 -->
    <title>在线设备管理</title>
    <!-- Bootstrap CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery -->
    <script src="js/jquery-3.4.1.min.js"></script>
    <!-- Bootstrap JS -->
    <script src="js/bootstrap.min.js"></script>
    <!-- 样式 CSS-->
    <link href="css/online.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <h1 class="page-header">在线设备管理</h1>
    <div class="row devices">
        <c:forEach items="${onlineList}" var="onlineList">
            <div class="device">
                <div class="img-hover">
                    <img class="img" src="${onlineList.img}" data-toggle="modal" data-target="#myModalupdate" onmouseover="show('${onlineList.id}')">
                </div>
                <table class="table">
                    <tr>
                        <th>设备ID：</th>
                        <td>${onlineList.id}</td>
                    </tr>
                    <tr>
                        <th>设备类型：</th>
                        <td>${onlineList.sDevType}</td>
                    </tr>
                    <tr>
                        <th>设备编号：</th>
                        <td>${onlineList.devNo}</td>
                    </tr>
                    <tr>
                        <th>设备名称：</th>
                        <td>${onlineList.devName}</td>
                    </tr>
                    <tr>
                        <th>设备状态：</th>
                        <td>${onlineList.devStatus}</td>
                    </tr>
                    <tr>
                        <th>操作：</th>
                        <td>
                            <button type="button" class="btn btn-success" >打开</button>
                            <button type="button" class="btn btn-danger" >关闭</button>
                        </td>
                    </tr>
                </table>
            </div>
        </c:forEach>
    </div>
    <!-- 编辑Modal 弹窗窗口 -->
    <div class="modal fade" id="myModalupdate">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><span class="sr-only">关闭弹窗</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabeupdate">设备运行信息</h4>
                </div>
                <div id=test class="modal-body">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-info" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>

    //查询记录
    function show(id){
        // $("#editdev")[0].reset();
        $.ajax({
            type:"POST",
            data:{"devId":id},
            url:"listDeviceFiled",

            dataType:"json",
            success:function(result){
                var html = "<p><span>设备id:"+id+"</p>";
                if(result!=null) {
                    result.dataObject.forEach((item, index) => {
                        console.log(item);
                        html += "<p><span>" + item.filedKey + ":</span>" + item.filedValue + "</p>";
                        $('#test').html(html);
                    })
                }else {alert("tips: 查询属性失败")}
            }
        });
    }
</script>

</html>
