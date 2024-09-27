package AulaDia27_09.Lista;

public class Vetor {
    String[] elementos;
    int tamanho;

    //Construtor da classe vetor
    public Vetor(int tamanho) {
        elementos = new String[tamanho];
        this.tamanho = 0;
    }

    //Adicionando um elemento ao vetor
    public boolean adiciona(String elemento) {
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        else{
            return false;
        }
    }
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String retorno = "[";
        for(int i=0;i<tamanho-1;i++) {
            retorno+=elementos[i]+",";
        }
        retorno+=elementos[tamanho-1]+"]";
        return retorno;
    }

    //Obtem um elemento de acordo com a posição
    public String obterElemento(int posicao){
        if (!(posicao>=0 && posicao<this.tamanho)) {
            throw new IllegalArgumentException("Posição do array não existe");
        }
        return this.elementos[posicao];
    }

    //Pesquisa um elemento na lista
    public int buscaElemento (String elemento){
        for(int i=0; i<this.tamanho;i++) {
            if(elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    //Adiciona um elemento a uma determinada posição
    public boolean adiciona(int posicao, String elemento) {
        if(!(posicao>=0 && posicao<this.tamanho)) {
            throw new IllegalArgumentException("Posição do array não existe");
        }
        for(int i=this.tamanho-1; i>=posicao;i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    //Aumenta a capacidade do array
    private void aumentaCapacidade(){
        if(this.tamanho==this.elementos.length) {
            String[] novoVetor = new String[this.elementos.length*2];
            //Copiando os elementos...
            for(int i=0; i<this.tamanho;i++) {
                novoVetor[i] = this.elementos[i];
            }
            this.elementos = novoVetor;
        }
    }
}
