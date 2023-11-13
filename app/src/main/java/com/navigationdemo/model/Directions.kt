package com.navigationdemo.model

data class Directions(
    var routes: List<List<HashMap<String, String>>>,
    var steps: ArrayList<Step>
)