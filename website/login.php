<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      padding: 40px;
      background-color: #ffffff;
      border-radius: 8px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .container h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-group {
      margin-bottom: 20px;
    }

    .form-group label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
    }

    .form-group input[type="email"],
    .form-group input[type="password"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      outline: none;
    }

    .form-group input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #4caf50;
      color: #ffffff;
      font-weight: bold;
      border: none;
      border-radius: 4px;
      outline: none;
      cursor: pointer;
    }

    .form-group input[type="submit"]:hover {
      background-color: #45a049;
    }

    .message {
      text-align: center;
      margin-top: 20px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Login Form</h2>
    <form method="POST" action="login.php">
      <div class="form-group">
        <label>Email:</label>
        <input type="email" name="email" required>
      </div>
      <div class="form-group">
        <label>Password:</label>
        <input type="password" name="password" required>
      </div>
      <div class="form-group">
        <input type="submit" name="login" value="Login" onclick="window.location.href= 'StudentList.php'; result false;">
      </div>
    </form>

    <?php
    // Check if the login form is submitted
    if (isset($_POST['login'])) {
      // Get the form data
      $email = $_POST['email'];
      $password = $_POST['password'];


      // Connect to the database (replace 'hostname', 'username', 'password', and 'database' with your actual database credentials)
      $conn = mysqli_connect('localhost', 'root', '', 'colleage2');

      // Check if the connection was successful
      if (!$conn) {
        die('Database connection error: ' . mysqli_connect_error());
      }

      // Escape the form data to prevent SQL injection
      $email = mysqli_real_escape_string($conn, $email);
      $password = mysqli_real_escape_string($conn, $password);

      // Perform the query to check if the user exists (replace 'users' with your actual table name)

      $query = "SELECT * FROM Students WHERE email='$email'";
      
      $result = mysqli_query($conn, $query);

      // Check if the query was successful and if a matching user was found
      if ($result && mysqli_num_rows($result) > 0) {
        $user = mysqli_fetch_assoc($result);
        $hashedPassword = $user['password'];
    
        if (password_verify($password, $hashedPassword)) {
            // Password is correct, perform the login logic
            // ...
    
            header("Location: StudentList.php");
        }} else {
        echo '<p class="message">Login failed. Invalid email or password.</p>';
      }

      // Close the database connection
      mysqli_close($conn);
    }
    ?>
  </div>
</body>
</html>