angular.module('TIYAngularApp', [])
   .controller('SampleController', function($scope, $http) {

        $scope.getMessages = function() {
               console.log("About to go get me some data!");

               $http.get("http://localhost:8080/messages.json")
                   .then(
                       function successCallback(response) {
                           console.log(response.data);
                           console.log("Adding data to scope");
                           $scope.messages = response.data;
                       },
                       function errorCallback(response) {
                           console.log("Unable to get data");
                       });
                       console.log("Done with the promise - waiting for the callback");
                };

                  $scope.makeArray = function(arraySize) {
                                              var returnArray = [];
                                              for (var i = 0; i < arraySize; i++) {
                                                  returnArray.push(i);
                                              }
                                              return returnArray;
                                          }

        $scope.addMessage = function() {
            console.log("About to add the following message " + JSON.stringify($scope.message));

            $http.post("/message.json", $scope.message)
                .then(
                    function successCallback(response) {
                        console.log(response.data);
                        console.log("Adding data to scope");
                        $scope.messages = response.data;
                    },
                    function errorCallback(response) {
                        console.log("Unable to get data");
                    });
        };

        $scope.message = {};
        $scope.messages = {};

    });
