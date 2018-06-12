var mongoose = require('mongoose');

var userSchema = mongoose.Schema({
    username: String,
    password: String,
    firstName: String,
    lastName: String,
    email: String,
    address:{
        type: mongoose.Schema.ObjectId, ref:'AddressModel'
    }

},{collection:'user'});

module.exports = userSchema;