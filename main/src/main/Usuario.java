package main;

public class Usuario{
    Item[] locados;
    
    public Usuario(int maxitens){
        locados = new Item[maxitens];
    }
    
    public void ChecarItem(int ID, Biblioteca alvo){
        alvo.InfoItem(ID);
    }
    
    public void ChecarEstoque(Biblioteca alvo){
        alvo.Listar();
    }
    
    public void ChecarLocados(){
        boolean possuiitens = false;
        int i = 0;
        while(i<locados.length && !possuiitens){
            if(locados[i]!=null){
                possuiitens = true;
            }
            i++;
        }
        if (!possuiitens){
            System.out.println("Este usuário não está com nenhum item locado");
        }
        else {
            System.out.println(" ITENS LOCADOS PELO USUÁRIO");
            System.out.println("=====");
            for(int j=0; j<locados.length; j++){
                if(locados[j]!=null)
                locados[j].getDados(true);
            }
            System.out.println("=====");
            System.out.println(" ");
        }
    }
    
    public void LocarItem(int ID, Biblioteca alvo){
        int espaco = -1;
        int i = 0;
        while (espaco == -1 && i<locados.length){
            if (locados[i]==null){
                espaco = i;
            }
            i++;
        }
        if (espaco == -1){
            System.out.println("ERRO: Usuário já está com o número máximo de itens");
        }
        else {
            locados[espaco] = alvo.getItem(ID);
        }
    }
    
    public void DevolverItem(int ID, Biblioteca alvo){
        int i = 0;
        boolean itemlocado = false;
        boolean procura = true;
        while (i<locados.length && procura){
            if (locados[i].ID==ID){
                itemlocado = true;
                procura = false;
            }
            i++;
        }
        if (!itemlocado){
            System.out.println("ERRO: Usuário não está com o item locado");
        }
        else{
            alvo.DevolveItem(locados[i].ID);
            locados[i]=null;
        }
    }
}