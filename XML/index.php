<!DOCTYPE html>
<html>

<head>
    <title>Space Objects</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <h1>Space Objects</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Distance</th>
            <th>Radius</th>
            <th>Gravity</th>
            <th>Temperature</th>
        </tr>
        <?php
        $xml = simplexml_load_file('space.xml');


        if ($xml) {
            foreach ($xml->space as $space) {
                echo "<tr>";
                echo "<td>" . $space->name . "</td>";
                echo "<td>" . $space->distance . "</td>";
                echo "<td>" . $space->radius . "</td>";
                echo "<td>" . $space->gravity . "</td>";
                echo "<td>" . $space->temperature . "</td>";

                echo "</tr>";
            }
        } else {
            echo "<tr><td colspan='5'>Failed to load the XML file.</td></tr>";
        }
        ?>
    </table>
</body>

</html>