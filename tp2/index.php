<?php
require_once 'config/config.php';
require_once 'services/StudentService.php';
$url = API_BASE_URL."/students";

$response = file_get_contents($url);
$students =StudentService::getAllStudents();
require_once 'views/students.php';

?>