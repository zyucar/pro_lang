<?php

session_start();
session_destroy();

echo 'Basariyla cikis yaptiniz yonlendriliyorsunuz.';
header('Refresh:3; url=giris.php');