public class Worker extends Thread {
    private JobQueue jobQueue;

    public Worker(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    @Override
    public void run() {
        while (true) {
            Job job = jobQueue.getJob();
            if (job != null) {
                job.setStatus(Job.JobStatus.PROCESSING);
                System.out.println("Processing job: " + job.getId());
                try {
                    Thread.sleep(job.getExecutionTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                job.setStatus(Job.JobStatus.EXECUTED);
                System.out.println("Job " + job.getId() + " completed.");
            }
        }
    }
}
