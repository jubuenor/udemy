package designPatterns.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

import designPatterns.creational.objectPool.Poolable;

/**
 * ObjectPool
 */
public class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> availablePool; // BlockingQueue is a queue that supports operations that wait for the queue
                                            // to become non-empty when retrieving an element, and wait for space to
                                            // become available in the queue when storing an element.

    public ObjectPool(Supplier<T> creator, int count) { // Supplier is a functional interface that takes no arguments
                                                        // and
                                                        // returns an object.
        availablePool = new LinkedBlockingQueue<>(); // LinkedBlockingQueue is an optionally-bounded blocking queue
                                                     // based
                                                     // on linked nodes.
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get()); // offer() is used to insert an element in the queue. If the operation
                                                // is successful, it returns true, otherwise false.
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException exception) {
            System.out.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException exception) {
            System.out.println("put() was interrupted");
        }
    }

}
