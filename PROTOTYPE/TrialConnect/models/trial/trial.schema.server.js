var mongo = require('mongoose');

var trialSchema = mongo.Schema({
    title: String,
    password: String,
    briefDescription: String,
    detailedDescription: String,
    sponsor:{
        type: Schema.Types.ObjectId,
        ref: 'SponsorModel'
    }
});