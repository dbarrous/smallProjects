<!-- 
  This is a project that takes in numbers from a text file and save them into an array,
  it then calculates stats and saves them to a HTML table. This is all done through the backend
  using PHP -->


<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <title>Lab 5</title>
  <link rel="stylesheet" href="style.css">
  <?php


  $arrays = file('text.txt');
  foreach ($arrays as $individualArray => $numbersInArray) {
    $arrays[$individualArray] = explode(',',$numbersInArray);
  }

function stan($array)
{
    $count = count($array);
    $var   = 0.0;
    $avg   = array_sum($array) / $count;

    foreach ($array as $key) {
        $var += pow(($key - $avg), 2);
    }
    return (float) sqrt($var / $count);
}





$counter = 0;
$min =0;
$max = 0;
$avg =0;
$stan=0;
function computeStats($array)

{
    global $counter;

    $min  = min($array);
    $max  = max($array);
    $avg  = array_sum($array) / count($array);
    $stan = stan($array);
    $counter++;
    echo "<tr><td>$counter</td>";
    echo "<td>$min</td>";
    echo "<td>$max</td>";
    echo "<td>$avg</td>";
    echo "<td>$stan</td></tr>";
}
?>
</head>

<body>
  <h1>Stats</h1>
  <h2>(Read From A Text File)</h2>
  <h3>By Damian Barrous</h3>
  <table summary="Table of Stats">
    <thead>
      <tr>
        <td>Test</td>
        <td>Min</td>
        <td>Max</td>
        <td>Avg</td>
        <td>St. Dev.</td>


      </tr>
    </thead>
    <tbody>
      <?php
foreach ($arrays as $array) {
    computeStats($array);

}

?>
   </tbody>
  </table>
</body>

</html>
