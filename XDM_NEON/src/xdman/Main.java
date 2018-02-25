package xdman;

import xdman.util.Logger;

public class Main {
	static {
		System.setProperty("http.KeepAlive.remainingData", "0");
		System.setProperty("http.KeepAlive.queuedConnections", "0");
		System.setProperty("sun.net.http.errorstream.enableBuffering", "false");
		System.setProperty("awt.useSystemAAFontSettings", "lcd");
		System.setProperty("swing.aatext", "true");
	}

	public static void main(String[] args) {
		Logger.log("loading...");
		Logger.log(System.getProperty("java.version")+" "+System.getProperty("os.version"));
		XDMApp.start(args);
	}

}
