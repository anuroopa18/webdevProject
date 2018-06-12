var mongoose = require('mongoose');

var addressSchema = require('./address.schema.server')

var userSchema = mongoose.Schema({
    username: String,
    password: String,
    firstName: String,
    lastName: String,
    email: String,
    address:[addressSchema]

},{collection:'user'});

module.exports = userSchema;