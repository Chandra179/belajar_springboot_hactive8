MongoDB -> BSON (binary json)
advantages -> parsing lbh cepat, mendukung tipe data native: dates, binary data

-----------------------------

use databasa_name -> membuat database
show dbs -> database list
show collections -> list of collections
db.createCollection("profile"); -> membuat collection

-----------------------------

db.collection.insertOne(); -> tambah 1 dokumen
db.profile.insertOne({ name : "t-rex", color: "red" });
- otomatis dibuat ID

-----------------------------

db.collection.insertMany(); -> tambah banyak dokumen
db.profile.insertMany(
	[
		{ name:"tricera" },
		{ name:"brachio" }
	]
)

-----------------------------

db.collection.find() -> menampilkan semua data
db.profile.find()  

-----------------------------

db.collection.find({condition}); -> mencari data dengan filter
db.profile.find({ name: "t-rex" });

-----------------------------

// I think you are using Mongoose and updateOne() 
// is not available there. You cannot use all native mongodb functions 
// with all drivers.

db.collection.updateOne(filter, update)
db.profile.upadateOne({ color: "red" },{ $set: { name : "allo" } })

alternative >> db.profile.update({ color: "red" },{ $set: { name : "allo" } })

-----------------------------

db.profile.insertMany(
	[
		{ name:"tricera" },
		{ name:"brachio" }
	]
)

----------------------------

db.collection.updateMany(filter, update) -> update multiple
db.profile.updateMany({name: "t-rex"}, {$set:{color: "blue"}})

// upsert combination of insert and delete
db.profile.updateMany({name: "t-rex"}, {$set:{color: "blue"}}, {upsert: true})

-----------------------------

db.collection.replaceOne(filter, update)

-----------------------------

db.collection.deleteOne(filter)
db.profile.deleteOne({ name : "brachio" });

-----------------------------

db.collection.deleteMany(filter)

-----------------------------