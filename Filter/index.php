<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $selectedDepartment = $_POST['department'];
    $xml = simplexml_load_file('details.xml');

    echo "<h1>Students of $selectedDepartment</h1>";
    
    foreach ($xml->student as $student) {
        if($student->dept == $selectedDepartment) {  
        echo "<p>Name: ". $student->name ."</p>";
        echo "<p>Department: ". $student->dept ."</p>";
        echo "<p>Year: ". $student->year ."</p>";
        echo "<hr>";
        }
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Student Filter</title>
</head>
<body>
    <h1>Student Filter</h1>
    <form method="POST" action="index.php">
        <label for="department">Select Department:</label>
        <select name="department" id="department">
            <option value="CSE">Computer Science and Engineering</option>
            <option value="ECE">Electronics and Communication Engineering</option>
            <option value="ME">Mechanical Engineering</option>
        </select>
        <br><br>
        <input type="submit" value="Filter">
    </form>
</body>
</html>
