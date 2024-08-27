public class Celular2{

    public static void main(String[] args){
        Celular cel = new Celular()
            cel.nome = "Galaxy";
            cel.tamanhoTela = 6.5f;
            cel.espacoArmazenamento = 256;
            cel.capacidadeBateria = "Android";
            cel.resolucaoCamera = 50;
          
            cel.ligar();
            cel.desligar();
            cel.mostrarStatusBateria();
            cel.tirarFoto();
            
            String infomacoes = obterInformacoes();
            System.out.println(informacoes);

                

    
    }

}