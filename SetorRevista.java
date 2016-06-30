package main;

public class SetorRevista implements InterfaceSetor{
    public Revista[] estoque;

    public SetorRevista(int maxitens){
        estoque = new Revista[maxitens];
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
        Revista revista = new Revista("Veja", "Abril");
    }

    @Override
    public void Listar(){
        for(int i = 0;i < estoque.length;i++){
            estoque[i].getDados();
        }
    }
}