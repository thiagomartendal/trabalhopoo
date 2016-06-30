package main;

public class SetorLivro implements InterfaceSetor{
    public Livro[] estoque;
    
    public SetorLivro(int maxitens){
        estoque = new Livro[maxitens];
        for(int i = 0;i < estoque.length;i++){
            estoque[i].ID = i;
        }
    }
    
    @Override
    public int ChecaEspaco(){
        int espaco = 0;
        for(int i = 0;i < estoque.length;i++){
            if(estoque[i] == null){
                espaco++;
            }
        }
        return espaco;
    }

    @Override
    public void NovoItem(){
        Livro livro = new Livro("O Conde de Monte Cristo", "Alexandre Dumas");
    }

    @Override
    public void Listar(){
        for(int i = 0;i < estoque.length;i++){
            estoque[i].getDados();
        }
    }
}