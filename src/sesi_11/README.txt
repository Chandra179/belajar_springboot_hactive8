MongoDB -> BSON (binary json)
advantages -> parsing lbh cepat, mendukung tipe data native: dates, binary data

-----------------------------

use database_name -> membuat database
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

// jika banyak dokumen dengan nama yang sama,
// maka salah satu dokumen akan didelete secara random/urut
db.profile.deleteOne({ name : "t-rex" });

-----------------------------

db.collection.deleteMany(filter)

-----------------------------

db.pasien.deleteMany({ name : "Foxy" })
db.penyakit.deleteMany({ penyakit : "flu" })

db.penyakit.insertOne({ _id: "sakit_0001", penyakit: "flu" });

// penyakit: "flu" -> (nama koleksi, reference value)

db.pasien.insertOne({ name : "Foxy", umur: 20, penyakit: "flu" });
var penyakit_flu = db.pasien.findOne().penyakit
db.penyakit.findOne({ penyakit : penyakit_id })

db.pasien.insertOne({ name : "Foxy", umur: 20, penyakit: "sakit_0001" });
var penyakit_id = db.pasien.findOne().penyakit
db.penyakit.findOne({ penyakit : penyakit_id })

-------------------------------