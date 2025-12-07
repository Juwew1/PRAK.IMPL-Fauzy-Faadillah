<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "dbImpal";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Koneksi database gagal: " . $conn->connect_error);
}

session_start();
if (!isset($_SESSION['id'])) {
    $_SESSION['id'] = 101;
}
?>