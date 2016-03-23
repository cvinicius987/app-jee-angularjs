(function(){
	angular.module("app").controller("clientCtrl", clientCtrl);
	
	clientCtrl.$inject = ["clientAPI"]; 
	
	function clientCtrl(clientAPI){
		
		var self = this;
		
		var Client = clientAPI.getClient();
		
		self.list = Client.query();
	};
})();