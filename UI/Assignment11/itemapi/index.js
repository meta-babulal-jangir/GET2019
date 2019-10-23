const mysql=require('mysql');
const express=require('express');
var app=express();
const bodyparser=require('body-parser');
app.use(function(req,res,next){
    res.header("Access-Control-Allow-Origin","*");
    res.header("Access-Control-Allow-Headers","Origin , X-Requested-With , Content-Type , Accept");
    next();
    });
app.listen(3000,()=>console.log('Express Serve is running'));
app.get('/',(req,res)=>{
    mysqlConnection.query('select * from item',(err,rows,fields)=>{
        if(!err){
            console.log(rows);
            res.send(rows);

        }
        else{
            console.log(err);
        }
    })
    
});

app.get('/:category',(req,res)=>{
    if(req.params.category!='all'){
        mysqlConnection.query('select * from item where item_id IN (select item_id from category_item where c_id =(select c_id from category where c_name=?))',[req.params.category],(err,rows,fields)=>{
            if(!err){
                res.send(rows);

            }
            else{
                console.log(err);
            }
        })
    }
    else{
        mysqlConnection.query('select * from item',(err,rows,fields)=>{
            if(!err){
                console.log(rows);
                res.send(rows);
    
            }
            else{
                console.log(err);
            }
        })
    }
    
});

var mysqlConnection = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'0000',
    database:'apidb'
});
mysqlConnection.connect((err)=>{
    if(!err){
        console.log('DB Connected');
    }
    else{
        console.log('Falied');
    }
});