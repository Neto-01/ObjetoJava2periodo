public class Celular{
    //Atributos
    //tamanhoTela
    //espacoArmazenamento
    //camera

    //metodos(acoes)
    //ligar
    //fazerLigacao
    //desligar
    //ligarCamera
    String nome;
    int capacidadeBateria;
    int espacoArmazenamento;
    float tamanhoTela;
    int resolucaoCamera;

    
    void ligar(){
        System.out.println("O celular está ligando...");
    }
    
    void desligar(){
        System.out.println("O celular está desligando...");
    }
    
    void mostraStatusBateria(){
        System.out.println("Capacidade da bateria:" + capacidadeBateria + "%" );
    }
    
    void tirarFoto(){
        System.out.println("Foto tirada!");
    }
    
    String obterInformacoes(){
        return "Nome" + String nome + "Bateria" + int capacidadeBateria + "Memoria" + int espacoArmazenamento;
    }
}

    












