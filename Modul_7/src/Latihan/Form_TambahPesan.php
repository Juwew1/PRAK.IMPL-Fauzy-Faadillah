<?php include '../tugas/db_config.php'; ?>
<!DOCTYPE html>
<html>
<head>
    <title>Tambah Pesan</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        h2 { border-bottom: 2px solid #ccc; padding-bottom: 10px; }
        label { display: block; margin-top: 10px; font-weight: bold; }
        input[type="number"], input[type="text"], textarea {
            width: 300px; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px;
        }
        textarea { resize: vertical; height: 100px; }
        input[type="submit"] {
            background-color: #4CAF50; color: white; padding: 10px 15px; border: none; border-radius: 7px; cursor: pointer; margin-top: 15px;
        }
        input[type="submit"]:hover { background-color: #45a049; }
        .navigasi a { text-decoration: none; color: #007bff; margin-right: 15px; }
        .navigasi a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<h2>Tambah Pesan</h2>
<form action="simpanPesan.php" method="POST">
    <label for="Penerima">ID Penerima:</label>
    <input type="number" name="Penerima" required>

    <label for="judul">Judul:</label>
    <input type="text" name="judul" required>

    <label for="TextPesan">Isi Pesan:</label>
    <textarea name="TextPesan" required></textarea>

    <input type="submit" name="submit" value="Kirim Pesan">
</form>

<hr>
<div class="navigasi">
    <a href="http://localhost/Modul_7_Link/src/Tugas/lihatPesan.php">Lihat Pesan </a>
</div>
</body>
</html>