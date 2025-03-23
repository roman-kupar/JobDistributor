public class Job
{
    private int id;
    private int priority;
    private long executionTime;
    private JobStatus status;

    public enum JobStatus {
        PENDING, PROCESSING, EXECUTED, FAILED
    }

    public Job(int id, int priority, long executionTime)
    {
        this.id = id;
        this.priority = priority;
        this.executionTime = executionTime;
        this.status = JobStatus.PENDING;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status)
    {this.status = status;}

    public long getExecutionTime() {
        return executionTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getId() {
        return id;
    }
}
