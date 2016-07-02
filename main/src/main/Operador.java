package main;

public class Operador extends Usuario{
    public Operador(int maxitens){
        super(maxitens);
    }
    
    public void CadastrarItem(int tipo, String nome, String extra, Biblioteca alvo){
        alvo.NovoItem(tipo, nome, extra);
    }
}