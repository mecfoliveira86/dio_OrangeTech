package methods03;

public class Usability {
	
	public static void main(String [] args) throws Exception{

		Methods01 smartTv = new Methods01();
		System.out.println("Power da TV: " + smartTv.power);
		System.out.println("Canal da TV: "+ smartTv.channel);
		System.out.println("Volume da TV: "+ smartTv.volume);
		
		System.out.println("Apertando o botão de ligar:");
		smartTv.ligar();
		System.out.println("Power da TV: " + smartTv.power);
		
		System.out.println("Apertando o botão de Volume +:");
		smartTv.raiseVolume();
		System.out.println("Volume da TV: "+ smartTv.volume);
		
		System.out.println("\n Apertando o botão de Volume -:");
		smartTv.reduceVolume();
		System.out.println("Volume da TV: "+ smartTv.volume);
		
		System.out.println("Selecionando um canal");
		int desiredChannel = 56;
		smartTv.changeChannel(desiredChannel);
		System.out.println("Canal da TV: "+ smartTv.channel);
		
		System.out.println("Selecionando um outro canal");
		desiredChannel = 156;
		smartTv.changeChannel(desiredChannel);
		System.out.println("Canal da TV: "+ smartTv.channel);
		
	}
	
	

}
