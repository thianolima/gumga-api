app.controller('IndexController', function($scope, $http){
	$scope.score = "0%";
	$scope.complexity = "MUITO FRACO";
	
	
	$scope.validate = function(){
		
		if($scope.pwd == ""){
			$scope.score = "0%";
			$scope.complexity = "MUITO FRACO";
		
		}else{
		
			$http({
				method: "POST",
				url: "/passwordmeter/" + $scope.pwd
			
			}).then(function sucess(response){
				$scope.score = response.data.score + "%";			
				
				if(response.data.complexity == 'VERY_WEAK'){
					$scope.complexity = 'MUITO FRACO';
				} 
				
				else if(response.data.complexity == 'WEAK'){
					$scope.complexity = 'FRACO';
				} 
				
				else if(response.data.complexity == 'GOOD'){
					$scope.complexity = 'BOM';
				} 
				
				else if(response.data.complexity == 'STRONG'){
					$scope.complexity = 'FORTE';
				} 
				
				else if(response.data.complexity == 'VERY_STRONG'){
					$scope.complexity = 'MUITO FORTE';
				}
							
				console.log(response.data);
						
			}, function error(response){
				
			});
		}
	}
	
});