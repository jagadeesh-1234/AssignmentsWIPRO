package CoreandCollections;

import java.util.PriorityQueue;

class Job {
    String name;
    int urgency;

    public Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    public String getName() {
        return name;
    }

    public int getUrgency() {
        return urgency;
    }
}

public class JobPicker_A7 {
    private PriorityQueue<Job> jobQueue;

    public JobPicker_A7() {
        jobQueue = new PriorityQueue<>((job1, job2) -> {
            if (job1.getUrgency() != job2.getUrgency()) {
                return Integer.compare(job1.getUrgency(), job2.getUrgency());
            }
            return Integer.compare(job1.getName().length(), job2.getName().length());
        });
    }

    public void addJob(String name, int urgency) {
        if (urgency < 1 || urgency > 5) {
            throw new IllegalArgumentException("Urgency must be between 1 and 5.");
        }
        jobQueue.offer(new Job(name, urgency));
    }

    public Job getNextJob() {
        return jobQueue.poll(); 
    }

    public static void main(String[] args) {
        JobPicker_A7 scheduler = new JobPicker_A7();
        scheduler.addJob("Fix bug", 2);
        scheduler.addJob("Write tests", 3);
        scheduler.addJob("Implement feature", 1);
        scheduler.addJob("Code review", 2);
        scheduler.addJob("Deploy", 5);
        scheduler.addJob("Update documentation", 2);

        Job nextJob;
        while ((nextJob = scheduler.getNextJob()) != null) {
            System.out.println("Next job: " + nextJob.getName() + " (Urgency: " + nextJob.getUrgency() + ")");
        }
    }
}
