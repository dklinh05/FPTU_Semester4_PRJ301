<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE html>  
<html lang="en">  
<head>  
    <meta charset="UTF-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>Display Details</title>  
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">  
</head>  
<body class="bg-light">  
    <div class="container mt-5">  
        <div class="card shadow p-4">  
            <h2 class="text-center text-primary">Student Information</h2>  
            <p><strong>Student Name:</strong> ${param.stuname}</p>  
            <p><strong>Student Roll No:</strong> ${param.rollno}</p>  

            <h3 class="text-center text-success">Order Summary</h3>  
            <ul class="list-group">  
                <li class="list-group-item">Coffee: ${param.coffee} cups</li>  
                <li class="list-group-item">Tea: ${param.tea} cups</li>  
                <li class="list-group-item">Milk: ${param.milk} cups</li>  
            </ul>  

            <form action="ELDemo.jsp" method="post" class="mt-4">  
                <input type="hidden" name="stuname" value="${param.stuname}">  
                <input type="hidden" name="rollno" value="${param.rollno}">  
                <input type="hidden" name="coffee" value="${param.coffee}">  
                <input type="hidden" name="tea" value="${param.tea}">  
                <input type="hidden" name="milk" value="${param.milk}">  

                <button type="submit" class="btn btn-success w-100">Confirm Order</button>  
            </form>  
        </div>  
    </div>  
</body>  
</html>  
