angular.module('DemoSam')
.factory('attivita', ['$resource', function attivitaFactory($resource){
//	return {
//		all: function  () {
//			return $http({ method: 'GET', url: '/listaAttivita'});
//		}
//	}
	return $resource("/listaAttivita", {}, {});
}]);