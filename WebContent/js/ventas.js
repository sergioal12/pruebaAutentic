/**
 * 
 */
'use strict'
var app = angular.module('ventas',[]);

app.controller('ventaController',['$scope','$http', function($scope, $http){
						console.log("entro al root pero no ha ejecutado ningun scope");
						$scope.pruebaPrimera = 1;
						$scope.getProductos = function(){
							$http.get("http://localhost:8080/pruebaAutentic/producto/"),success(function(data){
								$scope.productos = data;
							});
							}
						












} ]);