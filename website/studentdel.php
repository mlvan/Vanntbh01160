<?php
if ($_SERVER["REQUEST_METHOD"] == "GET" && isset($_GET['id'])) {
    $student_id = $_GET['id'];
    echo "Student ID: " . $student_id;
    // Kết nối đến cơ sở dữ liệu
    $hostname = "localhost";
    $username = "root";
    $password = "";
    $database = "colleage2";

    $conn = new mysqli($hostname, $username, $password, $database);

    // Kiểm tra kết nối
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Thực hiện câu lệnh SQL để xóa sinh viên khỏi cơ sở dữ liệu
    // Chú ý: Sử dụng phương pháp Prepared Statements để tránh lỗi SQL Injection
    $sql = "DELETE FROM Students WHERE Rollno = ?";

    $stmt = $conn->prepare($sql);
    $stmt->bind_param("s", $student_id);

    if ($stmt->execute()) {
        // Chuyển hướng người dùng sau khi xóa sinh viên thành công
        header("Location: StudentList.php");
        exit();
    } else {
        echo "Error deleting record: " . $stmt->error;
    }

    $stmt->close();
    $conn->close();
}
?>
