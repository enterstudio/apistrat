var express = require("express")
var app = express();
app.use(express.bodyParser());

var docs_handler = express.static(__dirname + '/specs');

var allowCrossDomain = function(req, res, next) {
    res.header('Access-Control-Allow-Origin', '*');

    if ('OPTIONS' == req.method) {
      res.send(200);
    }
    else {
      next();
    }
};
app.use(allowCrossDomain);

app.get(/^\/docs(\/.*)?$/, function(req, res, next) {
  if (req.url === '/docs') {
    res.writeHead(302, { 'Location' : req.url + '/' });
    res.end();
    return;
  }
  req.url = req.url.substr('/docs'.length);
  return docs_handler(req, res, next);
});

app.listen(8000);
