
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Management System</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-md bg-dark navbar-dark">

    <a class="navbar-brand" href="#">Employee Management System</a>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/employees">Employee Management</a>
            </li>
        </ul>
    </div>

</nav>

<div class="container">
    <div class="row">
        <h1>List of Employees</h1>
    </div>

    <table class="table table-striped table-bordered">
        <thead class="table-secondary">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>DOB</th>
            <th>Age</th>
            <th>Salary</th>
            <th>Status</th>
            <th>Actions</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="emp" items="${employees}" varStatus="stat">
       
        <tr>
                <td>${stat.index+1}</td>
                <td>${emp.name}</td>
                <td>${emp.email}</td>
                <td>${emp.pwd}</td>
                <td>${emp.dob}</td>
                <td>${emp.age}</td>
                <td>${emp.salary}</td>
                <td>${emp.status ? 'Active' : 'Inactive'}</td>
                <td>
                    <a href="/update?empId=${emp.id}"
                       class="btn btn-primary">Update</a>

                    <a href="${pageContext.request.contextPath}/delete/${emp.id}"
                       class="btn btn-danger">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="row">
        <div class="col-lg-3">
            <a href="${pageContext.request.contextPath}/newEmp" class="btn btn-primary btn-sm mb-3">Add Employee</a>
        </div>
    </div>

</div>
</body>
</html>
