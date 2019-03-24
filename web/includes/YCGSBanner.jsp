<%-- 
    Document   : YCGSBanner
    Created on : 2019. 1. 20, 오전 12:49:03
    Author     : Youngsun Chang
    Observer   : Gyeonglim Seo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="<c:url value='/styles/main.css'/> ">
        <link rel="stylesheet" href="<c:url value='/styles/YCGSStyle.css'/> ">
        <title>YCGS Computer Programming Club</title>
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    </head>
    <body>
        <header>
            <img src="<c:url value='/images/YCGS-icon.png'/>" alt="YCGS" width="60" height="60">
            <h1>YCGS Computer Programming Club</h1>
            <h2>IT@Conestoga</h2>
        </header>
        <nav id="nav_bar">
            <ul>
                <li><a href="<c:url value='/YCGSIndex.jsp'/>">Home</a></li>
                <li><a href="<c:url value='/YCGSRegister.jsp'/>">Register</a></li>
                <li><a href="<c:url value='/YCGSLoan'/>">eLoan</a></li>
                <li><a href="<c:url value='/YCGSCart'/>">eCart</a></li>
                <li><a href="<c:url value='/YCGSAdmin.jsp'/>">Admin</a></li>
            </ul>
        </nav>

