var mongoose = require('mongoose');
var userSchema = require('./user.schema.server')
var userModel = mongoose.model('User',userSchema);



