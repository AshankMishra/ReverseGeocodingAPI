<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Address</title>
</head>
<body>
	<form id="latLong" action="latLong" method="get">
		<div align="center">
			<table>
				<tr>
					<td>Enter the latitude</td>
					<td><input type="text" name="lat" /></td>
				</tr>
				<tr>
					<td>Enter the longitude</td>
					<td><input type="text" name="lng" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Get Address" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>