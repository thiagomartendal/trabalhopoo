package main;

public class SetorDVD implements InterfaceSetor{
    public DVD[] estoque;
        
    public SetorDVD(int maxitens){
        estoque = new DVD[maxitens];
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
        DVD dvd = new DVD("007 CONTRA SPECTRE", "Sam Mendes");
    }

    @Override
    public void Listar(){
        for(int i = 0;i < estoque.length;i++){
            estoque[i].getDados();
        }
    }
}