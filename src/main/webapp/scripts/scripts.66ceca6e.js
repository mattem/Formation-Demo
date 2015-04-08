/**
 * @ngdoc overview
 * @name angularHelperApp
 * @description
 * # angularHelperApp
 *
 * Main module of the application.
 */
angular
  .module('formationNgDev', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'multi-transclude',
    'ngFormation'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });

/**
 * @ngdoc function
 * @name angularHelperApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularHelperApp
 */
angular.module('formationNgDev')
  .controller('MainCtrl', ['$http', '$scope', function ($http, $scope) {
  	$scope.model = { domainNames: [], selected: '', debug: {} };
  	$scope.handlers = {};

  	(function(){
  		$http.get('http://localhost:8080/formation/list').then(function(data, status, headers, config){
  			console.log('Got formation object list:', data.data);
  			$scope.model.domainNames = data.data;
  		});
  	})();

  	$scope.handlers.select = function(key){
  		$scope.model.selected = $scope.model.domainNames[key];
  	};

  }]);
