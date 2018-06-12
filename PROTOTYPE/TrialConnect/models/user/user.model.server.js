var mongoose = require('mongoose');
var userSchema = require('./user.schema.server')
var userModel = mongoose.model('User',userSchema);

function createUser(user){
    userModel.create(user);
}

function findAllUsers(){
    return userModel.find();
}

var api = {
    createUser:createUser,
    findAllUsers:findAllUsers
};

module.exports = api;