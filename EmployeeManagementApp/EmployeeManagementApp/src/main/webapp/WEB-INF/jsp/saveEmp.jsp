<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Management System</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
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

<br><br>

<div class="text-center my-3">
    <p class="text-success font-weight-bold">
        <c:if test="${not empty succMsg}">
            ${succMsg}
        </c:if>
    </p>
    <p class="text-danger font-weight-bold">
        <c:if test="${not empty errMsg}">
            ${errMsg}
        </c:if>
    </p>
</div>

<div class="container">
    <div class="row">
        <div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
            <h1 class="text-center">Create New Employee</h1>
            <div class="card-body">
                <form:form action="${pageContext.request.contextPath}/newEmp" modelAttribute="employee" method="POST">
                    
                    <div class="form-group">
                        <label>Employee Name</label>
                        <form:input path="name" cssClass="form-control" placeholder="Enter Name"/>
                    </div>
                    
                    <div class="form-group">
                        <label>E-mail</label>
                        <form:input path="email" cssClass="form-control" placeholder="Enter e-mail"/>
                    </div>

                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" id="pwd" name="pwd" class="form-control" placeholder="Enter password"/>
                    </div>

                    <div class="form-group">
                        <label>DOB</label>
                        <input type="date" id="dob" name="dob" class="form-control" placeholder="Enter date-of-birth" onchange="calculateAge()"/>
                    </div>

                    <div class="form-group">
                        <label>Age</label>
                        <input type="number" id="age" name="age" class="form-control" readonly/>
                    </div>

                    <div class="form-group">
                        <label>Salary</label>
                        <form:input path="salary" cssClass="form-control" placeholder="Enter salary"/>
                    </div>

                    <div class="form-group">
                        <label>Status:</label>
                        <label><form:radiobutton path="status" value="true"/> Active</label>
                        <label><form:radiobutton path="status" value="false"/> Inactive</label>
                    </div>

                    <div class="box-footer">
                        <div class="row">
                            <div class="col-md-6">
                                <button type="submit" class="btn btn-primary float-left">Save</button>
                            </div>
                            <div class="col-md-6">
                                <a href="${pageContext.request.contextPath}/employees" class="btn btn-info float-right">Display All Employees</a>
                            </div>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function() {
        $("form").submit(function(event) {
            $(".error").remove();
            let isValid = true;
            let name = $("input[name='name']").val();
            if (name.length < 3 || name.length > 15) {
                isValid = false;
                $("input[name='name']").after('<span class="error text-danger">Name should be between 3 and 15 characters.</span>');
            }

            let email = $("input[name='email']").val();
            let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                isValid = false;
                $("input[name='email']").after('<span class="error text-danger">Please enter a valid email address.</span>');
            }

            let password = $("input[name='pwd']").val();
            if (password.length < 4) {
                isValid = false;
                $("input[name='pwd']").after('<span class="error text-danger">Password must be at least 4 characters long.</span>');
            }

            let dob = $("input[name='dob']").val();
            if (!dob) {
                isValid = false;
                $("input[name='dob']").after('<span class="error text-danger">Please enter a valid date of birth.</span>');
            }

            let salary = $("input[name='salary']").val();
            if (salary <= 0) {
                isValid = false;
                $("input[name='salary']").after('<span class="error text-danger">Salary must be greater than 0.</span>');
            }

            if (!isValid) {
                event.preventDefault();
            }
        });
    });

    function calculateAge() {
        var dobValue = document.getElementById("dob").value;
        if (dobValue) {
            var dob = new Date(dobValue);
            var today = new Date();
            var age = today.getFullYear() - dob.getFullYear();
            var monthDiff = today.getMonth() - dob.getMonth();
            if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < dob.getDate())) {
                age--;
            }
            document.getElementById("age").value = age;
        }
    }
</script>

</body>
</html>
