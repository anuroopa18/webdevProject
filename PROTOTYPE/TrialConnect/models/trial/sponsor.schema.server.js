var mongo = require('mongoose');

var sponsorModel = mongo.Schema({
    address:{
        type: Schema.Types.ObjectId,
        ref: 'AddressModel'
    }
});