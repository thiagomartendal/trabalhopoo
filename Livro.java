package main;

public class Livro extends Item{
    protected String autor;
    
    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
        this.disp = true;
    }
    
    public void getDados(){
        System.out.println(this.ID);
        System.out.println(this.nome);
        System.out.println(this.autor);
    }
}