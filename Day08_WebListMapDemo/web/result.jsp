<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Marks</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            color: #2c3e50;
        }
        .container {
            border: 1px solid #ccc;
            padding: 15px;
            border-radius: 5px;
            width: 400px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
    </style>
</head>
<body>

    <h1>Danh sách sinh viên và điểm số</h1>

    <div class="container">
        <table>
            <tr>
                <th>Họ và Tên</th>
                <th>Java</th>
                <th>Math</th>
                <th>Eng</th>
            </tr>
            
            <tr>
                <td>A Nguyen</td>
                <td>${studentMarks["A Nguyen"]["Java"]}</td>
                <td>${studentMarks["A Nguyen"]["Math"]}</td>
                <td>${studentMarks["A Nguyen"]["Eng"]}</td>
            </tr>
            
            <tr>
                <td>B Tran</td>
                <td>${studentMarks["B Tran"]["Java"]}</td>
                <td>${studentMarks["B Tran"]["Math"]}</td>
                <td>${studentMarks["B Tran"]["Eng"]}</td>
            </tr>

            <tr>
                <td>C Le</td>
                <td>${studentMarks["C Le"]["Java"]}</td>
                <td>${studentMarks["C Le"]["Math"]}</td>
                <td>${studentMarks["C Le"]["Eng"]}</td>
            </tr>

        </table>
    </div>

</body>
</html>
