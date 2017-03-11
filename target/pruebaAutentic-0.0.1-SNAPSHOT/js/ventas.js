/**
 * 
 */
'use strict'
var app = angular.module('ventas',[]);

app.controller('ventaController',['$scope','$http',
                                  
              function($scope, $http){
						$scope.getProductos = function(){
							$http.get("http://localhost:8080/pruebaAutentic/producto/"),success(function(data){
								$scope.productos = data;
							});
							}
				$scope.prueba = function(){
					$scope.prueba = 1;
				}		












} ]);