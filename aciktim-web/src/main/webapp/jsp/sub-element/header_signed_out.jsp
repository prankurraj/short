<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="container text-center" id="header-signed-out">
    <link rel="stylesheet" type="text/css" href="${contextPath}/assets/custom_style/header-signed-out-style.css"/>
    <div class="row" id="header-main-row">
        <div class="col-md-6" id="header-col1">
            <div id="page-name">
                <img src="${contextPath}/assets/img/aciktim_logo.png" alt=""/>
            </div>
        </div>
        <div class="col-md-6" id="header-col2">
            <div class="row">
                <form action="${contextPath}/login" method="post" class="navbar-form">
                    <div class="form-group">
                        <input type="text" name="email" placeholder="Email" class="form-control">
                    </div>

                    <div class="form-group">
                        <input type="password" name="password" placeholder="Password" class="form-control">
                        <button type="submit" class="btn btn-success">Sign in</button>
                        <a href="signup" class="btn btn-primary">Sign up</a>
                    </div>
                </form>
            </div>
            <div class="row">
                <div class="col-md-12 text-right">
                    <a id="forgot-password" href="">Forgot Password</a>
                </div>
            </div>
        </div>
    </div>
</div>