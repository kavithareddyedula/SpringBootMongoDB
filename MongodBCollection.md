#MongoDB installation on mac m2 

#
> show dbs

> use ABCInsurance  // —> in relation db it is called schema 

> show dbs —> still ABCInsurance won’t show up until u create a collection with data 

> db.Customer.insert({firstname:"testfirstname",lastname:"test1lastname",address:"1233 st,ny,20005"})
WriteResult({ "nInserted" : 1 })
It creates the Customer collection(relational DB - table)

 > show dbs  —>   shows the ABCInsurance and even the collection name Customer 

db.getCollection('test').update({}, {$set: {"country": "country"}},false,true)