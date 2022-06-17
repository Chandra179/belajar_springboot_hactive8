Concurrent
 - makan kue dan nyanyi secara bersamaan
 - There are two tasks executing concurrently,
   tetapi berjalan di 1-core CPU, 
   so the CPU will decide to run a task first and then the other task 
   or run half a task and half another task, etc. 
   Two tasks can start, run, and complete in overlapping time periods 
   i.e Task-2 can start even before Task-1 gets completed. 
   It all depends on the system architecture.
   
Parallel
 - split tasks menjadi smaller sub-task yang bisa di proses secara parallel, 
   ex: menjalankan pada multiple CPU pada waktu yang sama
 - untuk menjalankan parallel, tidak harus ada dua task atau lebih,
   ia akan menjalankan bagian dari task atau multiple task secara bersamaan
   menggunakan multi-core infrastructure dari CPU dengan cara assigning
   core ke tiap task/sub-task
 - If we keep going with the same example as above, the rule is still 
   singing and eating concurrently, but this time, you play in a team of two. 
   You probably will eat and let your friend sing 
   (because she sings better and you eat better). 
   So this time, the two tasks are really executed simultaneously, 
   and it’s called parallel.
   