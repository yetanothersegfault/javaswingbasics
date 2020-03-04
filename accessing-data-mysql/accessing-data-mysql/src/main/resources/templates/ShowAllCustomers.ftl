<!DOCTYPE html>
<html>
<head>
    <title>Customers</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>List of customers</h2>

<table>
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>

    <#list cities as city>
    <tr>
        <td>${city.id}</td>
        <td>${city.first_name}</td>
        <td>${city.last_name}</td>
    </tr>
</#list>
</table>
</body>
</html>