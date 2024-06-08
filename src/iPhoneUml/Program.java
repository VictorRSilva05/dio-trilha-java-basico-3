package iPhoneUml;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		Telefone telefone = new Telefone();
		Internet internet = new Internet();
		
		player.selecionarMusica();
		player.tocarMusica();
		player.pausarMusica();
		
		telefone.atender();
		telefone.encerrarChamada();
		telefone.ligar();
		
		internet.adicionarNovaGuia();
		internet.atualizarGuia();
		internet.exibirPagina();
	}

}
