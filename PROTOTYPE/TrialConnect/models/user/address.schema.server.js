var mongoose = require('mongoose');

var addressSchema = mongoose.Schema({
    street: String,
    apartment: String,
    city: String,
    state: String,
    country: String
},{collection:'address'});

module.exports = addressSchema;