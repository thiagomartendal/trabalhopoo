package main;

public class Main{
    public static void main(String[] args){
        Biblioteca BU = new Biblioteca(10);
        Operador Joseph = new Operador(10);
        Usuario Jorge = new Usuario(10);
        
        Joseph.CadastrarItem(1, "Battle Royale", "Kashoun Takami", BU);
        Joseph.CadastrarItem(2, "Galileu #1", "Abril", BU);
        Joseph.CadastrarItem(3, "Django Unchained", "Quentin Tarantino", BU);
        
        Jorge.ChecarEstoque(BU);
        Jorge.LocarItem(0, BU);
        Jorge.ChecarLocados();
        Jorge.ChecarEstoque(BU);
        Jorge.DevolverItem(0, BU);
     //   Jorge.ChecarLocados();
    }
}