public class main {

    /**
     *  Head First Java - Networking and threads
     *
     * Basic advice server
     *
     * Will display messages to clients
     */


    public static void main(String ARGS[]){


        System.out.println("DailyAdvice: Server\n\n");

        DailyAdviceServer server = new DailyAdviceServer();

        server.go();


    }



}
