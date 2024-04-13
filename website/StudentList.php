<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style/styles.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>student management</title>
    head>
<style>
        /* Table Styles */
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
            color: #333;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #e5e5e5;
        }
        
        /* Heading Style */
        h2 {
            color: #333;
            background-color: #f2f2f2;
            padding: 10px;
            margin-bottom: 20px;
        }
    </style>
    <!-- <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th,
        td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
    </style> -->
</head>
<body>
<?php

        //Creating connect to database
        $conn = mysqli_connect('localhost', 'root','', 'colleage2') or die("Can not connect database".mysqli_connect_error());
        //Retrieving data from table 
        $sql = "select * from students";
        //Executing query.
        $result = mysqli_query($conn,$sql);
    ?>
     <h2>Students List</h2>
    <!-- Add Student Form -->
    <form method="post" action="studentadd.php">
        <label for="rollno">Roll No:</label>
        <input type="text" id="Rollno" name="Rollno"><br><br>
        <label for="Stname">Student FullName:</label>
        <input type="text" id="Stname" name="Stname"><br><br>
        <label for="Address">Address:</label>
        <input type="text" id="Address" name="Address"><br><br>
        <label for="Email">Email:</label>
        <input type="text" id="Email" name="Email"><br><br>
        <!-- <input type="submit" value="Add Student"> -->
        <button type="submit" name= 'btn_add' class="btn add-student" >Add Student</button>
    </form>
    <table align="center" border="1px" cellpadding="0" cellspacing="0">
        <caption align="center">Student List</caption>
        <tr>
            <th>Rollno</th>
            <th>Student FullName</th>
            <th>Address</th>
            <th>Email</th>
            </tr>
        <?php
            while($row = mysqli_fetch_array($result, MYSQLI_ASSOC))
            {
        ?>
        <tr>
            <td><?php echo $row['Rollno']; ?></td>
            <td><?php echo $row['Stname']; ?></td>
            <td><?php echo $row['Address']; ?></td>
            <td><?php echo $row['Email']; ?></td>
            <td>
                    <a href=" student edit.php?id=<?php echo $row['Rollno']; ?>">Edit</a> 
                    <a href="studentdel.php?id=<?php echo $row['Rollno']; ?>" onclick="return confirm('Are you sure?')">Delete</a>
                </td>
        </tr>
            <?php
                }
            ?>
    </table>
</body>
</html>
