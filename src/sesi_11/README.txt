MongoDB -> BSON (binary json)
advantages -> parsing lbh cepat, mendukung tipe data native: dates, binary data

-----------------------------

use databasa_name -> membuata database
show dbs -> database list
db.createCollection("profile"); -> membuat collection

-----------------------------

db.collection.insertOne(); -> tambah 1 dokumen
db.profile.insertOne({ name : "t-rex", color: "red" });
- otomatis dibuat ID

-----------------------------

db.collection.insertMany(); -> tambah banyak dokumen
db.profile.insertMany(
	[
		{ name:"tricera"},
		{
			name:"brachio",
		}
	]
)

-----------------------------

db.collection.find()
db.profile.find()  -> menampilkan semua data

-----------------------------

db.collection.find();
db.profile.find({ name: "t-rex" });

-----------------------------

db.collection.updateOne(filter, update)
db.profile.upadateOne(
	{ color: "red" },
	
)

-----------------------------

db.collection.updateMany(filter, update)

-----------------------------

db.collection.replaceOne(filter, update)

-----------------------------

db.collection.deleteOne(filter)

-----------------------------

db.collection.deleteMany(filter)

-----------------------------

mvn clean install compile

mvn exec:java -Dexec.mainClass="com.learning.challenge.TestOnePiece" -Dexec.classpathScope="test"

mvn exec:java -Dexec.mainClass="com.learning.challange.Main"
mvn exec:java -Dexec.mainClass="com.learning.sax.Main"


-----------------------------