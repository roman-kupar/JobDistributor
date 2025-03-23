import java.util.ArrayList;
import java.util.List;

public class JobManager {
    private JobQueue jobQueue;
    private List<Worker> workers;

    public JobManager(int workerCount) {
        jobQueue = new JobQueue();
        workers = new ArrayList<>();
        for (int i = 0; i < workerCount; i++) {
            Worker worker = new Worker(jobQueue);
            workers.add(worker);
            worker.start();
        }
    }

    public void submitJob(Job job) {
        jobQueue.addJob(job);
        System.out.println("Job " + job.getId() + " submitted.");
    }
}
