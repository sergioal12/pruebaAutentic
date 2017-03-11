<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prueba autentic sergio alejandro plata</title>
<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/angular-route.min.js"></script>
<script type="text/javascript" src="js/ventas.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


</head>
<body ng-app="ventas">
<div class="row panel panel-default" ng-controller="ventaController">
	<div class="panel-heading">
		<h1>prueba autentic sergio alejandro plata</h1>
	</div>
<div class="col-md-10 col-offset-2 panel panel-default" ng-init="getProductos()">
	<div class="panel-heading">
		<h2>Productos</h2>
	</div>
	
	<div ng-repeat="producto in productos" class="panel-body">
		<div class="input-group">
			<span class="input-group-addon">Id producto
			<input readonly="true" class="form-control" placeholder="{{producto.id}}">
			</span>
			<span class="input-group-addon">nombre producto
			<input readonly="true" class="form-control" placeholder="{{producto.nomProducto}}">
			</span> 
			<span class="input-group-addon">Cantidad 
			<input readonly="true" class="form-control" placeholder="{{producto.cantProducto}}">
			</span>
			<span class="input-group-addon">ubicacion
			<input readonly="true" class="form-control" placeholder="{{producto.ubicacionProducto}}">
			</span>
		</div> 
	</div>
</div>
	
<div class="col-md-10 col-offset-2 panel panel-default" ng-init="getVentas()">
	<div class="panel-heading">
		<h2>Ventas</h2>
	</div>
	<div ng-repeat="venta in ventas" class="panel-body">
		<div class="input-group">
			<span class="input-group-addon">Id venta
				<input readonly="true" class="form-control" placeholder="{{venta.id}}">
			</span>
			<span class="input-group-addon">estado de la venta
				<input readonly="true" class="form-control" placeholder="{{venta.ventaEfectuada}}">
			</span>
			<span class="input-group-addon">fecha de la venta
				<input readonly="true" class="form-control" placeholder="{{venta.fechaVenta}}">
			</span>
			<span class="input-group-addon">total venta
				<input readonly="true" class="form-control" placeholder="{{venta.totalVenta}}">
			</span>
			<span class="input-group-addon">lugar de venta
				<input readonly="true" class="form-control" placeholder="{{venta.despachoVenta}}">
			</span>
			<span class="input-group-addon">Id producto
				<input readonly="true" class="form-control" placeholder="{{venta.idProducto}}">
			</span>
		</div>
	</div>
</div>
</div>
	
</body>
</html>