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
var addsql = 'INSERT INTO local3306(id,name,age,apple) VALUES(3,?,?,?)';
var addsqlParams = ["three",12,11];
connection.query(addsql,addsqlParams,function(error,result){
    if(error){ throw error;return;}
    console.log("ad",result);
});