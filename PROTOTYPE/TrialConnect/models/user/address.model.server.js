var mongoose = require('mongoose');
var addressSchema = require('./address.schema.server');
var addressModel = mongoose.model('Address',addressSchema);

function createAddress(address){
    addressModel.create(address);
}

var api = {
    createAddress:createAddress
};

module.exports = api;