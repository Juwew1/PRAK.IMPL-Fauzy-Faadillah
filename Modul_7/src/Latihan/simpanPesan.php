<?php global $conn;
include 'db_config.php'; ?>
<!DOCTYPE html>
<html>
<head>
    <title>Simpan Pesan</title>
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
$idPengirim = $_SESSION['id'];
$idPenerima = $conn->real_escape_string($_POST['Penerima'] ?? '');
$judul = $conn->real_escape_string($_POST['judul'] ?? '');
$TextPesan = $conn->real_escape_string($_POST['TextPesan'] ?? '');
$date = date('Y-m-d H:i:s');

if (empty($idPenerima) || empty($judul) || empty($TextPesan)) {
    echo "<div class='alert-danger'>Pesan gagal ditambahkan. Data input tidak lengkap.</div>";
} else {
    $sql = "INSERT INTO Pesan (idPengirim, idPenerima, Judul, TextPesan, WktPesan) 
            VALUES ('$idPengirim', '$idPenerima', '$judul', '$TextPesan', '$date')";

    if ($conn->query($sql) === TRUE) {
        echo "<div class='alert-success'><h2>Pesan Berhasil Terkirim!</h2></div>";
    } else {
        echo "<div class='alert-danger'><h2>Pesan Gagal Terkirim!</h2></div>";
        echo "<p>Error: " . $conn->error . "</p>";
    }
}

$conn->close();
?>
<div class="navigasi">
    <a href="Form_TambahPesan.php">Kembali ke Form Tambah Pesan</a>
    <a href="http://localhost/Modul_7_Link/src/Tugas/lihatPesan.php">Lihat Pesan </a>
</div>
</body>
</html>