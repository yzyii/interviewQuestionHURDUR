// Online Java Compiler (https://www.programiz.com/java-programming/online-compiler/)
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        JobProvider a = new CoolJobProvider();
        JobProvider b = new AwesomeJobProvider();
        JobProvider c = new DumbJobProvider();
        JobProvider d = new SillyJobProvider();
        JobProvider e = new FunnyJobProvider();
        
        // Run these for an example of how your data might look like
        // Notice that we are limiting the output here to 10 jobs but each job provider could provide an unlimited number of jobs.
        printJobs(a, 10, "CoolJobProvider");
        printJobs(b, 10, "AwesomeJobProvider");
        printJobs(c, 10, "DumbJobProvider");
        printJobs(d, 10, "SillyJobProvider");
        printJobs(e, 10, "FunnyJobProvider");
        
        List<JobProvider> providers = new ArrayList();
        providers.add(a);
        providers.add(b);
        providers.add(c);
        providers.add(d);
        providers.add(e);
        
        // Let's make this an entire class so it's easier for you noobs...
        ImplementMe implementMe = new ImplementMe(providers);
        
        System.out.print("Here we go! (the following should be in order):\n");
        for (int i = 0; i < 1000; i++) {
            System.out.print(implementMe.getNextJob().datetime + "\n");
        }
    }
    
    static void printJobs(JobProvider jobProvider, int n, String label) {
        System.out.print(label + "\n");
        for (int i = 0; i < n; i++) {
            System.out.print(jobProvider.getJob().datetime + "\n");
        }
        System.out.print("\n");
    }
}

class ImplementMe {
    List<JobProvider> providers;
    
    ImplementMe(List<JobProvider> providers) {
        this.providers = providers;
    }
    
    public Job getNextJob() {
        // TODO: IMPLEMENT THIS.
        // THE OUTPUT SHOULD BE:
        // 4,5,6,8,8,11,11,12,16,17 etc...
        return new Job(-1);
    }
}

class Job {
    long datetime;
    
    Job(long datetime) {
        this.datetime = datetime;
    }
}

interface JobProvider {
    public abstract Job getJob();
}

class CoolJobProvider implements JobProvider {
    Random random = new Random(1);
    long i = 0;
    
    public Job getJob() {
        Job job = new Job(i + random.nextInt(9));
        i = i + 10;
        return job;
    }
}

class AwesomeJobProvider implements JobProvider {
    Random random = new Random(2);
    long i = 0;
    
    public Job getJob() {
        Job job = new Job(i + random.nextInt(9));
        i = i + 10;
        return job;
    }
}

class DumbJobProvider implements JobProvider {
    Random random = new Random(3);
    long i = 0;
    
    public Job getJob() {
        Job job = new Job(i + random.nextInt(9));
        i = i + 10;
        return job;
    }
}

class SillyJobProvider implements JobProvider {
    Random random = new Random(4);
    long i = 0;
    
    public Job getJob() {
        Job job = new Job(i + random.nextInt(9));
        i = i + 10;
        return job;
    }
}

class FunnyJobProvider implements JobProvider {
    Random random = new Random(5);
    long i = 0;
    
    public Job getJob() {
        Job job = new Job(i + random.nextInt(9));
        i = i + 10;
        return job;
    }
}
