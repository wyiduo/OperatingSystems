
**Explanation of the page replacement algorithms:**

FIFO algorithm basically stores the frames in a queue so that the first frame that entered the queue is the first frame to be dequeued from the queue.

LFU algorithm uses a list to store the frames in physical memory and uses a queue to store the recently referenced pages. The algorithm will work in that when a page is referenced, it is stored in the queue. If the page is already in the queue, it will delete it from the queue and requeue the page. This is because if a page is referenced more recently, than the page is more frequent, hence why it is requeued. From there, when a frame needs to be removed from physical memory, the algorithm continuously dequeues the queue storing the recently referenced pages until it gets to a page that is also in the list of frames in physical memory. Then, the page that was last dequeued is the frame that is removed from the list of frames in physical memory.

MFU algorithm is basically the LFU algorithm, but instead of a queue storing the recently referenced pages, it is a stack that stores the recently referenced pages. And, of course, the stack is popped instead of dequeued. The algorithm continuously pops the stack storing the recently referenced pages until it gets to a page that is also in the list of frames in physical memory. Then, the page that was last popped is the frame that is removed from the list of frames in physical memory.
