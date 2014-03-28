/**
 * Server.java
 * Created on Mar 24, 2014
 */
package ru.mipt.spring2014.class07.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Server implements Runnable 
{
	private final int port;

	public Server (int port)
	{
		this.port = port;
	}

	public void run() 
	{
		final ServerSocket socket;
		final ExecutorService execSrv = Executors.newFixedThreadPool (1);		
		try{
			System.out.println ("Server: Start accepting connections");
			socket = new ServerSocket (port);
         
			while(!Thread.interrupted ())
		{
			execSrv.submit (new RequestHandler (socket.accept ()));
			System.out.println ("Server: Connection accepted");
		}
			
                System.out.println ("Server: Stop accepting requests");
				socket.close ();
			
		} catch (IOException ex)
		{
			System.err.println ("Server: Exception in server thread: " + ex);
		}
	}
}
