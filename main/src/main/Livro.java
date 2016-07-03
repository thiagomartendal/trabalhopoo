package main;

public class Livro extends Item{
    protected String autor;
    
    public Livro(int ID, String nome, String autor){
        this.ID = ID;
        this.nome = nome;
        this.autor = autor;
        this.disp = true;
    }
    
    @Override
    public void getDados(boolean user){
        System.out.println("ID: " + this.ID);
        System.out.println("Livro: " + this.nome);
        System.out.println("Autor: " + this.autor);
        if (!this.disp && !user){
            System.out.println("ITEM INDISPONÍVEL");
        }
        System.out.println("---");
    }
}