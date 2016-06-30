package main;

public class DVD extends Item{
    protected String diretor;
    
    public DVD(String nome, String diretor){
        this.nome = nome;
        this.diretor = diretor;
        this.disp = true;
    }
    
    public void getDados(){
        System.out.println(this.ID);
        System.out.println(this.nome);
        System.out.println(this.diretor);
    }
}