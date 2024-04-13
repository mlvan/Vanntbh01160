<!DOCTYPE html>
<html>
<head>
  <title>Registration Page</title>
  <style>
    body {
      display: flex;
      align-items: center;
      justify-content: center;
      min-height: 50vh;
      background-color: #E5E7EB;
    }

    .container {
      padding: 8px;
      max-width: 300px;
      width: 90%;
      background-color: #fff;
      border-radius: 7px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .title {
      font-size: 1.5rem;
      font-weight: bold;
      margin-bottom: 1rem;
    }

    .form-group {
      margin-bottom: 1rem;
    }

    label {
      display: block;
      color: #4B5563;
      font-size: 0.875rem;
      font-weight: bold;
      margin-bottom: 0.5rem;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: 90%;
      padding: 0.75rem;
      border: 1px solid #D1D5DB;
      border-radius: 0.25rem;
      outline: none;
      transition: border-color 0.3s;
    }

    input[type="text"]:focus,
    input[type="email"]:focus,
    input[type="password"]:focus {
      border-color: #7C3AED;
    }

    .button {
      width: 90%;
      background-color: #7C3AED;
      color: #fff;
      font-weight: bold;
      padding: 0.75rem;
      border: none;
      border-radius: 0.25rem;
      outline: none;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    .button:hover {
      background-color: #6D28D9;
    }
  </style>
</head>
 <body>
  <div class="container">
    <h2 class="title">Register</h2>
    <form action="register.php" method="post" class="form">
      <div class="form-group">
        <label for="fullname">Full Name</label>
        <input id="fullname" name="fullname" type="text" placeholder="Enter your full name">
      </div>
      <div class="form-group">
        <label for="email">Email</label>
        <input id="email" name="email" type="email" placeholder="Enter your email">
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" type="password" placeholder="Enter your password">
      </div>
      <div class="form-group">
        <label for="confirm_password">Confirm Password</label>
        <input id="confirm_password" name="confirm_password" type="password" placeholder="Confirm your password">
      </div>
      <button type="submit" name = "button_regist"class="button">Login Page</button>
    </form>
  </div>

  <?php

  // Database connection settings
  $_servername = "localhost";
  $_username = "root";
  $_password = "";
  $_dbname = "colleage2";
  
  if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Process the submitted data
    $conn = new mysqli($_servername, $_username, $_password, $_dbname);
    if (isset($_POST['button_regist'])) {
      $email = $_POST['email'];
      $fullname = $_POST['fullname'];
      $password = $_POST['password'];
      $confirm_password = $_POST['confirm_password'];
      $hash_password  = password_hash($password, PASSWORD_DEFAULT);
      // Check if the email already exists
      $query = "SELECT * FROM Students WHERE email = '$email'";
      $result = $conn->query($query);

      if ($result->num_rows > 0) {
        // Email already exists, display error or take appropriate action
        echo '<script>alert("Email already exists!");</script>';
      } else {

        // Create a connection

        // Check connection
        if ($conn->connect_error) {
          die("Connection failed: " . $conn->connect_error);
        }

        // Prepare the insert statement
        $stmt = $conn->prepare("INSERT INTO Students (Stname, password, email) VALUES (?, ?, ?)");

        // Bind parameters and execute the statement
        $stmt->bind_param("sss", $fullname, $hash_password, $email);

        if ($stmt->execute()) {
          echo "New user created successfully!";
          header("Location: login.php");
        } else {
          echo "Error: " . $stmt->error;
        }

        // Close the statement and the database connection
        $stmt->close();
        $conn->close();
      }
    } elseif (isset($_POST['button_login'])) {
      // Button 2 is clicked, redirect to page2.php
      header("Location: login.php");
      exit(); // Make sure to exit after redirecting
    }


    exit();
 }
  ?>
</body>
</html>