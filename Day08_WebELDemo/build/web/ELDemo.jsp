<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE html>  
<html lang="en">  
<head>  
    <meta charset="UTF-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>Order Confirmation</title>  
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">  
</head>  
<body class="bg-light">  
    <div class="container mt-5">  
        <div class="card shadow p-4">  
            <h2 class="text-center text-primary">Order Confirmation</h2>  
            <p><strong>Student Name:</strong> ${param.stuname}</p>  
            <p><strong>Student Roll No:</strong> ${param.rollno}</p>  

            <h3 class="text-center text-success">Your Order</h3>  
            <ul class="list-group">  
                <li class="list-group-item">Coffee: ${param.coffee} * $3.5 = ${param.coffee * 3.5} USD</li>  
                <li class="list-group-item">Tea: ${param.tea} * $2.5 = ${param.tea * 2.5} USD</li>  
                <li class="list-group-item">Milk: ${param.milk} * $4.5 = ${param.milk * 4.5} USD</li>  
            </ul>  

            <h3 class="text-center text-danger mt-3">Total Amount:  
                ${param.coffee * 3.5 + param.tea * 2.5 + param.milk * 4.5} USD  
            </h3>  
        </div>  
    </div>  
</body>  
</html>  
