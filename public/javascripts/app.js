var casadeMascotas = angular.module('casadeMascotas', []);


tienda.config(function($routeProvider) {
  $routeProvider
          .when('/',
                    {
                      templateUrl: 'app/views/Application/index.html'
                      ,controller: 'index'
                    }
              )
      
          .when('/loginMas',
                    {
                    controller:  'loginMas',
                    templateUrl: 'app/views/Application/loginMas.html'
                   })
          .when('/ver',
                 {
                 controller:  'ver',
                 templateUrl: 'app/views/Application/ver.html'
          })
          .when('/verMas',
                 {
                 controller:  'verMas',
                 templateUrl: 'app/views/Application/verMas.html'
          })

          .when('/hazteSocio',
                 {
                 controller:  'hazteSocio',
                 templateUrl: 'app/views/Application/hazteSocio.html'
          })
          .when('/contactar',
                 {
                 controller:  'contactar',
                 templateUrl: 'app/views/Application/contactar.html'
          })
          .when('/apadrina',
                 {
                 controller:  'apadrina',
                 templateUrl: 'app/views/Application/apadrina.html'
          })

          .otherwise({ redirectTo: '/' });
});


// Definicion de clases

//Función que permite solo Números
function ValidaSoloNumeros() {
 if ((event.keyCode < 48) || (event.keyCode > 57))
  event.returnValue = false;
}
//-----------------------------------



tienda.factory("global",
  function($rootScope, $http)
  {
    var obj = {};

    // in not session
    obj.productos = [];
    obj.camisetas = [];


    // in session
    obj.entradas = [];


    obj.addToCar = function(e)
    {

        var tmp = new Entrada();
        angular.copy(e, tmp);

        $http.get("rest/db/entradas").success(
          function(data)
          {
            if(true)
            {
              obj.entradas.push(tmp);
              $rootScope.$broadcast("addToCar");
            }

          }
        );
    }

    obj.delToCar = function(nom)
    {

        for (var i = 0; i < obj.car.length; i++) {
          if(obj.car[i].nombre == nom)
          {

            $http.get("rest/db/entradas").success(
              function(data)
              {
                if(true)
                obj.car.splice(1, i);
                $rootScope.$broadcast("addToCar");
              }
            );

            break;
          }
        };

    }

    obj.getCamisetas = function()
    {

      if(obj.productos.length > 0)
        $rootScope.$broadcast("getCamisetas");
      else
        $http.get("rest/db/camisetas").success(
          function(data)
          {
            obj.camisetas = data;
            $rootScope.$broadcast("getCamisetas");
          }
        );
    }

    obj.getProductos = function()
    {

      if(obj.productos.length > 0)
        $rootScope.$broadcast("getProductos");
      else
        $http.get("rest/db/productos").success(
          function(data)
          {
            obj.productos = data;
            $rootScope.$broadcast("getProductos");
          }
        );
    }

    obj.getProducto = function(id)
    {
      for (var i = 0; i < obj.productos.length; i++) {
        if(obj.productos[i].id == id)
          return obj.productos[i];
      };
    }

    obj.getEntradas = function()
    {

      if(obj.productos.length > 0)
        $rootScope.$broadcast("getEntradas");
      else
        $http.get("rest/db/entradas").success(
          function(data)
          {
            for (var i = 0; i < data.length; i++) {
              var tmp = new Entrada();
              angular.copy(data[i], tmp);
              obj.entradas.push(tmp);
            };

            $rootScope.$broadcast("getEntradas");
          }
        );
    }

    return obj;
  }
);

function main($scope, global)
{
  console.log("main");

  $scope.entradas = global.entradas;

  $scope.$on("addToCar",
    function()
    {
      $scope.car = global.entradas;
    }
  );
}


function car($scope, global)
{
  console.log("car");

  $scope.lista = global.getEntradas();


  $scope.$on("getEntradas",
    function()
    {
      $scope.lista = global.entradas;
    }
  );

  $scope.addToCar = function(e){

    global.addToCar(e);
  }
}


function detalle ($scope, $routeParams, $location, global)
{
  $scope.id = $routeParams.id;
  $scope.prod = global.getProducto($scope.id);

  if( !$scope.prod )
    $location.path('/');


  $scope.addToCar = function(e)
  {
    global.addToCar(e);
  }

}


function home($scope, $http, global)
{
  console.log("home");

  $scope.$on("getProductos",
    function()
    {
      $scope.productos = global.productos;

    }
  );



}

tienda.controller("main", main);
tienda.controller("index", index);
tienda.controller("loginMas", loginMas);
tienda.controller("ver", ver);
tienda.controller("verMas", verMas);
tienda.controller("hazteSocio",hazteSocio);
tienda.controller("contactar", contactar);
tienda.controlelr("apadrina", apadrina);
