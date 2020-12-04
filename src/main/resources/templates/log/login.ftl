<html>
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">
<#--    <#include "../common/nav.ftl">-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form role="form"  method="post" action="/seller/log/save">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Id</label>
                            <input name="Id" type="text" class="form-control" }>
                        </div>


                        <div class="form-group">
                            <label for="exampleInputEmail1">password</label>
                            <input name="password" type="text" class="form-control" }>
                        </div>

<#--                         <input hidden type="text" name="openId" value="${(SellerInfo.openId)!''}">-->
                        <button type="submit" class="btn btn-default" >登录</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>