var app = angular.module("myShop",[]);

	app.controller("appCtrl",function($scope){
		$scope.items = [
		{
			id:0,
			name:"C programklama",
			price:40
		},
		{
			id:1,
			name:"java",
			price:50,
		},
		{
			id:2,
			name:"Bilimsel Hesaplamalar",
			price:25
		},
		{
			id:3,
			name:"İsletim Sistemleri",
			price:55
		}
	];
	$scope.myItems = [];

	$scope.addItem = function(newItem){
		
		if( $scope.myItems.length == 0){
			newItem.count = 1;
			$scope.myItems.push(newItem);
		}else{
			var repeatingItem = false;
			for (var i=0; i<$scope.myItems.length; i++){
				if($scope.myItems[i].id == newItem.id){
					repeatingItem = true;
					$scope.myItems[i].count++;
				}
			};
			if(!repeatingItem){
				newItem.count = 1;
			$scope.myItems.push(newItem);
			}
		}
		updatePrice();
	}
	var updatePrice = function(){
		var totalPrice = 0;
		for(var i=0; i< $scope.myItems.length; i++){
			totalPrice += $scope.myItems[i].count * $scope.myItems[i].price;
		}
		$scope.totalPrice = totalPrice;
		}
	
	});
