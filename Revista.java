package main;

public class Revista extends Item{
    protected String editora;
    
    public Revista(String nome, String editora){
        this.nome = nome;
        this.editora = editora;
        this.disp = true;
    }
    
    public void getDados(){
        System.out.println(this.ID);
        System.out.println(this.nome);
        System.out.println(this.editora);
    }
}