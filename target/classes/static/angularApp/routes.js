angular.module('DemoSam')
.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise('/home');

	$stateProvider
		.state('listaAttivita',{
			url:'/attivita',
			templateUrl: "attivita/elencoAttivita/index.html",
			controller: 'attivitaController'
		})
		.state('inserisciAttivita',{
			url:'/inserisciAttivita',
			templateUrl: "attivita/inserisciAttivita/index.html",
			controller: 'attivitaController'
		})
		.state('gestisciAttivita',{
			url:'/gestisciAttivita',
			templateUrl: "attivita/gestisciAttivita/index.html",
			controller: 'attivitaController'

		})
		.state('home',{
			url:'/home',
			templateUrl: "home.html"
		})	
});