<?php
global $conn;
include '../Latihan/db_config.php';
?>
<!DOCTYPE html>
<html>
<head>
    <title>Hapus Pesan</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        .alert-success { background-color: #d4edda; color: #155724; padding: 15px; border: 1px solid #c3e6cb; border-radius: 5px; margin-bottom: 20px; }
        .alert-danger { background-color: #f8d7da; color: #721c24; padding: 15px; border: 1px solid #f5c6cb; border-radius: 5px; margin-bottom: 20px; }
        .navigasi a { text-decoration: none; color: #007bff; margin-right: 15px; }
        .navigasi a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<?php
if (isset($_GET['id'])) {
    $idPesan = $conn->real_escape_string($_GET['id']);
    $idMember = $_SESSION['id'];

    $sql = "DELETE FROM Pesan WHERE idPesan = '$idPesan' AND idPengirim = '$idMember'";

    // OUTPUT (Info hapus pesan)
    if ($conn->query($sql) === TRUE) {
        if ($conn->affected_rows > 0) {
            echo "<div class='alert-success'><h2>Pesan Berhasil Dihapus!</h2></div>"; // Output("pesan berhasil dihapus")
        } else {
            echo "<div class='alert-danger'><h2>Pesan Gagal Dihapus!</h2></div>"; // Output("pesan gagal dihapus")
            echo "<p>Pesan tidak ditemukan atau Anda tidak memiliki izin untuk menghapus pesan ini.</p>";
        }
    } else {
        echo "<div class='alert-danger'><h2>Pesan Gagal Dihapus!</h2></div>"; // Output("pesan gagal dihapus")
        echo "<p>Error: " . $conn->error . "</p>";
    }
} else {
    echo "<div class='alert-danger'><h2>Proses Hapus Gagal</h2></div>";
    echo "<p>ID Pesan tidak ditemukan dalam permintaan.</p>";
}

$conn->close();
?>
<div class="navigasi">
    <a href="lihatPesan.php">Kembali ke Lihat Pesan</a>
</div>
</body>
</html>