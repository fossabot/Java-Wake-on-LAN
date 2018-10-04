import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> ips = new ArrayList<>();
		ArrayList<String> macs = new ArrayList<>();
		Scanner sc = null;

		try {
			sc = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Import computer list
		try {
			String ip;
			String mac;
			while (sc.hasNextLine() == true) {
				ip = sc.nextLine();
				mac = sc.nextLine();
				MagicPacket.cleanMac(mac);
				ips.add(ip);
				macs.add(mac);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Wake Computers
		try {
			for (int i = 0; i < ips.size(); i++) {
				System.out.println("Sending Wake on LAN packet to: " + ips.get(i));
				System.out.println(MagicPacket.send(macs.get(i), ips.get(i)));
				Thread.sleep(2000);
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Failed to send Weake-on-LAN packet:" + e.getMessage());
		}
	}
}
