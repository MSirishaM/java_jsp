var http = require('http');
var url = require('url');
var util = require('util');



var mysql = require('mysql');
var connection = mysql.createConnection({
    host:"localhost",
    user: 'root',
    password:'12345678',
    database:'sys'
});
connection.connect();
 
// var addsql = 'INSERT INTO local3306(id,name,age,apple,orange,watermelon) VALUES(2,?,?,?,?,?)';
// var addsqlParams = ["xiaowang",22,19,10,12];
// connection.query(addsql,addsqlParams, function (error, result) {
//   if (error) {throw error; return;}
//   console.log('INSERT ID:',result);
// });

// var mosql = 'UPDATE local3306 SET name=? WHERE id=?';
// var mosqlPara = ['six',6];
// connection.query(mosql,mosqlPara, function (error, result) {
//   if (error) {throw error; return;}
//   console.log('UPDATE affectedRows',result.affectedRows);
// });

// var deSql = 'DELETE FROM local3306 WHERE id = 6';
// connection.query(deSql,function(err,result){
//     if (error) {throw error; return;}
//     console.log('de',result);
// });
var dataResult = {};
var addsql = 'SELECT * FROM local3306 WHERE id = 2';
var addsqlParams = [6];
connection.query(addsql,function(error,result){
    if(error){ throw error;return;}
    dataResult = JSON.stringify(result[0]);
    console.log(result[0]);
});


http.createServer(function(req, res){
    res.writeHead(200, {'Content-Type': 'text/plain; charset=utf-8'});
    res.write(dataResult);
    res.end();
}).listen(3088);