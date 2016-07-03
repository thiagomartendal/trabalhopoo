package main;

public abstract class Item{
    protected int ID;
    protected String nome;
    public boolean disp;
    
    abstract void getDados(boolean user);
}