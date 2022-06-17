Concurrent
 - makan kue dan nyanyi secara bersamaan
 - There are two tasks executing concurrently, 
   but those are run in a 1-core CPU, 
   so the CPU will decide to run a task first and then the other task 
   or run half a task and half another task, etc. 
   Two tasks can start, run, and complete in overlapping time periods 
   i.e Task-2 can start even before Task-1 gets completed. 
   It all depends on the system architecture.
Parallel
 - split tasks menjadi smaller sub-task
 - bisa di proses secara parallel, ex: multiple CPU pada waktu yang sama