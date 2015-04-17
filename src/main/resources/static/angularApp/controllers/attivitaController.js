angular.module('DemoSam')
.controller('attivitaController', ['$scope', 'attivita', function($scope, attivita){
	$scope.lavori = "Lavori in corso....";
	$scope.attivita = {};
	
//	attivita.all().success(
//		function (data) {
//			$scope.attivita = data;
//		});

	$scope.attivita = attivita.query();
}])