import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  Head First Java - Networking and threads
 *
 * Basic advice server
 *
 * Will display messages to clients
 */


public class DailyAdviceServer {

    // List of random pieces of advice
    private String[] adviceList = { "Take smaller bites", "Go for the tight jeans, they do NOT make you look fat",
                                    "Just for today, be honest and tell your boss what you *Really* think",
                                    " You might want to rethink that haircut", " Go outside, get some sun!"};


    /**
     * go
     *
     * Creates server socket
     *
     * Passes line from adviceList to printWriter for clients to read
     */
    public void go(){


        try {

            // create new socket  on port 5000
            ServerSocket s = new ServerSocket( 5000);

            // server goes into permanent loop waiting for and servicing clients
            while(true){

                //waits for nw request and returns socket
                Socket sock = s.accept();

                // using socket connection make a printWriter
                PrintWriter writer = new PrintWriter(sock.getOutputStream());

                // get single piece of advice
                String advice = getAdvice();

                // add advice writer
                writer.println(advice);

                // close writer
                writer.close();

                // print advice to server console
                System.out.println(advice);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /**
     * getAdvice
     *
     *
     * @return adviceList[random]: returns random string from adviceList
     */
    public String getAdvice(){

        int random = (int) (Math.random() * adviceList.length);


      return adviceList[random];
    }








}
