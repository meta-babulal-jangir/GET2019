public class UseJobScheduler {
	public static void main(String[] args) {
		JobScheduler jobObj=new JobScheduler(4);		// 4 is Number Of Jobs
		int[][] jobs=new int[][]{{0,10},{6,20},{60,10},{110,5}};
        jobObj.readJobs(jobs);
        int ct[]=jobObj.completionTime();
        int tat[]=jobObj.turnAroundTime();
        int wt[]=jobObj.waitingTime();
        System.out.println("Process      Completion Time      TAT      Waiting Time");
        for(int i=0;i<ct.length;i++)
        {	
        	System.out.print("P"+(i+1));
        	System.out.print("                "+ct[i]);
        	System.out.print("              "+tat[i]);
        	System.out.print("          "+wt[i]);
        	System.out.println();
        }	
        System.out.println("\n\nAverage waiting Time is :"+jobObj.avgWaitingTime());
        System.out.println("\nMaximum waiting Time is :"+jobObj.maxWaitingTime());
	}

}
