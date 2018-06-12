var mongo = require('mongoose');
var sponsorSchema = require('./sponsor.schema.server');
var sponsorModel = mongo.model('Sponsor', sponsorSchema);