# Java Wake on LAN
A simple java program to wake up computers after a controlled shutdown.

<p align="center">
  <img src="https://raw.githubusercontent.com/Edge-Route-Networks/Edge-Route-Networks.github.io/master/img/logos/logo-dark.png">
</p>

### Configure Computers to Wake on LAN
Edit Computers.txt and add the computer's IP address on the first line, then the MAC address on the 
second line. To add another computer, repeat the same process by adding the computer's IP address and MAC address below the first entry.

```txt
192.168.1.101
AE-2B-26-A0-9A-AF
192.168.1.102
60-AB-92-F6-61-E5
192.168.1.103
5B-93-CB-6F-33-53
```
**Note:** Don't add any spaces in Computers.txt.

### How to Run
[Java](https://java.com) needs to be installed and the Computers.txt file needs to be specified as a command line parameter. 

```sh
java-wol.jar C:/Computers.txt
```

### Credits
Credit to [Matt Black](https://github.com/mafrosis) for [MagicPacket.java](https://github.com/mafrosis/Wake-On-Lan/blob/master/src/net/mafro/android/wakeonlan/MagicPacket.java) (Origional Link)
