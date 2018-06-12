var mongoose = require('mongoose');
var addressSchema = require('./address.schema.server');
var addressModel = mongoose.model('Address',addressSchema);