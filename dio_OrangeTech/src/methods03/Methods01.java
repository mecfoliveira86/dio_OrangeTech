package methods03;
//This class will simulate a SmartTV with its functions like volume and channel control 

/**
 @author felipe
 @version 1.0
 @param power
 @param volume
 @param channel
 * */
public class Methods01 {
	/*Indicates if the television is on (True) or off (False)*/
	boolean power = false;
	/*Indicates the television volume between 0 and 100*/
	int volume = 0;
	/*Indicates the television channel between 0 and 100*/
	int channel = 50;
	
	public void ligar() {
		power = true;
	}
	
	public void desligar() {
		power = false;
	}
	
	public void raiseVolume() {
		String volumeData = "";
		if(volume >= 100) {
			volumeData = "Volume no Máximo!";
		} else {			
			volume++;
			volumeData += volume;
		}
		 System.out.println(volumeData);;
	}
	
	public void reduceVolume() {
		String volumeData = "";
		if(volume <= 0) {
			volumeData = "Volume no Mínimo!";
		} else {			
			volume--;
			volumeData += volume;
		}
		 System.out.println(volumeData);;
	}
	
	public void raiseChannel() {
		String channelData = "";
		if(channel >= 100) {
			channelData = "Último Canal!";
		} else {			
			channel++;
			channelData += channel;
		}
		 System.out.println(channelData);;
	}
	
	public void reduceChannel() {
		String channelData = "";
		if(channel <= 0) {
			channelData = "Primeiro Canal!";
		} else {			
			channel--;
			channelData += channel;
		}
		 System.out.println(channelData);;
	}
	
	public void changeChannel(int newChannel) {
		if(newChannel >= 0 && newChannel <= 100) {
			channel = newChannel;
		} else {
			System.out.println("Canal fora do range da TV!");
		}
	}
	
}
