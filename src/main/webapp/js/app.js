'use strict';
angular.module("myApp", ["ngRoute"])
    .config( function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl : "view/main.html"
            })
            .when("/login", {
                templateUrl : "view/login.html"
            })
        ;

    });