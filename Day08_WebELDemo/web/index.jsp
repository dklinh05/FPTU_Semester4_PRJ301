<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE html>  
<html lang="en">  
<head>  
    <meta charset="UTF-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>Student Order Form</title>  
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">  
</head>  
<body class="bg-light">  
    <div class="container mt-5">  
        <div class="card shadow p-4">  
            <h2 class="text-center text-primary">Student Information</h2>  
            <form action="display.jsp" method="post">  
                <div class="mb-3">  
                    <label class="form-label">Student Name:</label>  
                    <input type="text" name="stuname" class="form-control" required>  
                </div>  
                <div class="mb-3">  
                    <label class="form-label">Student Roll No:</label>  
                    <input type="text" name="rollno" class="form-control" required>  
                </div>  

                <h3 class="text-center text-success">Order Details</h3>  
                <div class="mb-3">  
                    <label class="form-label">Coffee ($3.5 each):</label>  
                    <input type="number" name="coffee" class="form-control" value="0" min="0">  
                </div>  
                <div class="mb-3">  
                    <label class="form-label">Tea ($2.5 each):</label>  
                    <input type="number" name="tea" class="form-control" value="0" min="0">  
                </div>  
                <div class="mb-3">  
                    <label class="form-label">Milk ($4.5 each):</label>  
                    <input type="number" name="milk" class="form-control" value="0" min="0">  
                </div>  

                <button type="submit" class="btn btn-primary w-100">Submit Details</button>  
            </form>  
        </div>  
    </div>  
</body>  
</html>  
