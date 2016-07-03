package main;

public class DVD extends Item{
    protected String diretor;
    
    public DVD(int ID, String nome, String diretor){
        this.ID = ID;
        this.nome = nome;
        this.diretor = diretor;
        this.disp = true;
    }
    
    @Override
    public void getDados(boolean user){
        System.out.println("ID: " + this.ID);
        System.out.println("DVD: " + this.nome);
        System.out.println("Diretor: " + this.diretor);
        if (!this.disp && !user){
            System.out.println("ITEM INDISPONÍVEL");
        }
        System.out.println("---");
    }
}