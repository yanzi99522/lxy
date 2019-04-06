package MultiThread;

public class TicketDB {
    private int ticketCount=5;

    public int getTicketCount(){
        return ticketCount;
    }

    public void sellTicket(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第"+ticketCount+"票已经售出");
    }
}
