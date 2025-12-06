<?php
global $conn;
include '../Latihan/db_config.php';

$idMember = $_SESSION['id'];
$idMember = $conn->real_escape_string($idMember);

$sql = "SELECT * FROM Pesan WHERE idPengirim = '$idMember' OR idPenerima = '$idMember' ORDER BY WktPesan DESC";
$result = $conn->query($sql);

?>
<!DOCTYPE html>
<html>
<head>
    <title>Lihat Pesan</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        h2 { border-bottom: 2px solid #ccc; padding-bottom: 10px; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; }
        th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }
        th { background-color: #f2f2f2; }
        .member-id { font-weight: bold; color: #d9534f; }
        .navigasi a { text-decoration: none; color: #007bff; margin-right: 15px; }
        .navigasi a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<h2>Lihat Pesan</h2>

<?php
if ($result->num_rows > 0) {
    echo "<table>
                <tr>
                    <th>ID Pesan</th>
                    <th>Pengirim</th>
                    <th>Penerima</th>
                    <th>Judul</th>
                    <th>Isi Pesan</th>
                    <th>Waktu</th>
                    <th>Aksi</th>
                </tr>";
    while($row = $result->fetch_assoc()) {
        echo "<tr>
                    <td>" . $row["idPesan"] . "</td>
                    <td>" . $row["idPengirim"] . "</td>
                    <td>" . $row["idPenerima"] . "</td>
                    <td>" . htmlspecialchars($row["Judul"]) . "</td>
                    <td>" . htmlspecialchars(substr($row["TextPesan"], 0, 50)) . (strlen($row["TextPesan"]) > 50 ? '...' : '') . "</td>
                    <td>" . $row["WktPesan"] . "</td>";

        // Hanya izinkan hapus jika dia adalah pengirimnya (Data Pesan {member memilih data pesan})
        if ($row["idPengirim"] == $idMember) {
            echo "<td><a href='hapusPesan.php?id=" . $row["idPesan"] . "'>Hapus</a></td>";
        } else {
            echo "<td>-</td>";
        }
        echo "</tr>";
    }
    echo "</table>";
} else {
    echo "<p>Tidak ada data pesan.</p>";
}

$conn->close();
?>
<hr>
<div class="navigasi">
    <a href="http://localhost/Modul_7_Link/src/Latihan/Form_TambahPesan.php">Tambah Pesan </a>
</div>
</body>
</html>