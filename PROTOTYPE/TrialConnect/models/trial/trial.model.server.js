var mongoose = require('mongoose');
var trialSchema = require('./trial.schema.server');
var trialModel = mongoose.model('Trial', trialSchema);