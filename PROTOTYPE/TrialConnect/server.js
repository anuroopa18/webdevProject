var express = require('express')
var bodyParser = require('body-parser');

const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/TrialConnect');

var app = express ()

app.get('/', function (req, res) {
    res.send('Hello World')
  })
  
  app.get('/message/:theMessage', function (req, res) {
      var theMessage = req.params['theMessage'];
      res.send(theMessage);
    })

    

    var userModel = require('./models/user/user.model.server');



userModel.findAllUsers().then(function(users){
    console.log(users);
})
    app.listen(3000)

