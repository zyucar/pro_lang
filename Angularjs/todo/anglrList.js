function toDoCtrl($scope) {
  
  $scope.todoFld = []
  
  $scope.todos = [
    {
      text: "Ev eşyası", 
      done:"false"
    },{
      text: "İş malzemesi", 
      done:"false"
    }
  ];
  
  $scope.addTodo = function () {
    
    if ($scope.todoFld != "") {
      $scope.todos.push({text: $scope.todoFld , val: $scope.valFld});
      $scope.todoFld = "";
    }
  };
  
  $scope.doneTodo = function($index) {
    $scope.todos[$index].done = $scope.todos[$index].done ==="done" ? false : "done";
  };
  
}