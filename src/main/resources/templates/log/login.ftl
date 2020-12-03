<html>
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">
    <#include "../common/nav.ftl">
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form role="form"  method="get" action="/seller/log/login">
                        <div class="form-group">
                            <label for="exampleInputEmail1">name</label>
                            <input name="openId" type="text" class="form-control" value="${(SellerInfo.openId)!''}">
                        </div>


                        <div class="form-group">
                            <label for="exampleInputEmail1">type</label>
                            <input name="password" type="text" class="form-control" value="${(SellerInfo.password)!''}">
                        </div>

<#--                         <input hidden type="text" name="openId" value="${(SellerInfo.openId)!''}">-->
                        <button type="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>