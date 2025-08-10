<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home | Spring MVC</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to right, #fdfbfb, #ebedee);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            color: #333;
        }

        .container {
            text-align: center;
            background: white;
            padding: 50px 70px;
            border-radius: 20px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
        }

        h1 {
            color: #2c3e50;
            margin-bottom: 15px;
        }

        p {
            font-size: 18px;
            margin-bottom: 30px;
        }

        a.button {
            text-decoration: none;
            padding: 12px 25px;
            background-color: #28a745;
            color: white;
            font-weight: bold;
            border-radius: 6px;
            transition: background-color 0.3s ease;
        }

        a.button:hover {
            background-color: #218838;
        }

        .footer {
            margin-top: 20px;
            font-size: 13px;
            color: #888;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Home Page</h1>
        <p>You have successfully navigated to the Spring MVC Home Page.</p>
        <a href="index" class="button">Back to Index</a>
        <div class="footer">
            &copy; 2025 SpringSimpleWebApp
        </div>
    </div>
</body>
</html>
