
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        
        
        smartTv.ligar();
        System.out.println("Novo status da TV: Ligada: " + smartTv.ligada);
        
        
        smartTv.aumentarVolume();
        System.out.println("Volume modificado para: aumentou:" + smartTv.volume);


        smartTv.baixarVolume();
        System.out.println("Volume modificado para: baixou:" + smartTv.volume);


        smartTv.mudarCanal(22);
        System.err.println("Você mudou o Canal para: "+ smartTv.canal);
        
    }


}
