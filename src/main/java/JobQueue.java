import java.util.concurrent.PriorityBlockingQueue;

public class JobQueue {
    private PriorityBlockingQueue<Job> queue;

    public JobQueue() {
        queue = new PriorityBlockingQueue<>(10, (j1, j2) -> Integer.compare(j2.getPriority(), j1.getPriority()));
    }

    public void addJob(Job job) {
        queue.add(job);
    }

    public Job getJob() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
