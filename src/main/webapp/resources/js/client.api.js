(function(){
	angular.module("app").factory("clientAPI", clientAPI);
	
	clientAPI.$inject = ["$resource"];
	
	function clientAPI($resource){
		
		var service = {
			getClient: getClient
		};
		
		return service;
		
		function getClient(){
			return $resource("api/clients");
		};
	};
})();