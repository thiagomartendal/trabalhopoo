package main;

public class Biblioteca {
    private Item[]estoque;
    
    public Biblioteca (int maxitens){
        estoque = new Item[maxitens];
    }
    
    private int EncontraEspaco(){
        int ret = -1;
        int i = 0;
        while (ret == -1 && i < estoque.length){
            if (estoque[i]==null){
                ret = i;
            }
            i++;
        }
    return ret;
    }
    
    void NovoItem (int tipo, String nome, String extra){
        int espaco = this.EncontraEspaco();
        if (espaco == -1){
            System.out.println("ERRO: Estoque cheio");
        } else {
            switch (tipo) {
                case 1:
                    Livro livro = new Livro(espaco, nome, extra);
                    estoque[espaco] = livro;
                    break;
                case 2:
                    Revista revista = new Revista(espaco, nome, extra);
                    estoque[espaco] = revista;
                    break;
                case 3:
                    DVD dvd = new DVD(espaco, nome, extra);
                    estoque[espaco] = dvd;
                    break;
                default:
                    System.out.println("ERRO: Tipo inválido");
                    break;
            }
        }
    }
}
