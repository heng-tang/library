<%--
  Created by IntelliJ IDEA.
  User: tangheng
  Date: 2021/2/6
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新书籍</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>更新书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%-- 不加id否则sql执行失败   第一种是隐藏的id--%>
<%--        <input type="hidden" name="bookID" value="${oldBook.bookID}"/>--%>
        <div class="form-group">
            <label>书籍编号：</label>
            <input type="text" class="form-control" value="${oldBook.bookID}"  required/>
        </div>
        <div class="form-group">
            <label>书籍名称：</label>
            <input type="text" name="bookName"   class="form-control" value="${oldBook.bookName}"  required/>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control"  value="${oldBook.bookCounts}" required/>
        </div>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail"  class="form-control" value="${oldBook.detail}"  required/>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改"/>
        </div>
    </form>

</div>

</body>
</html>
