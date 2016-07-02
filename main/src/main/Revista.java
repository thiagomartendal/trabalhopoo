package main;

public class Revista extends Item{
    protected String editora;
    
    public Revista(int ID, String nome, String editora){
        this.ID = ID;
        this.nome = nome;
        this.editora = editora;
        this.disp = true;
    }
    
    @Override
    public void getDados(boolean user){
        System.out.println("ID: " + this.ID);
        System.out.println("Revista: " + this.nome);
        System.out.println("Editora: " + this.editora);
        if (!this.disp && !user){
            System.out.println("ITEM INDISPONÍVEL");
        }
        System.out.println("---");
    }
}