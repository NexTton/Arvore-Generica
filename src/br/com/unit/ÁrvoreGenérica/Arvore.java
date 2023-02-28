/* Aluno: Gabriel Cruz Araujo 
   Aluno: Edson Augusto	
*/
package br.com.unit.ÁrvoreGenérica;

import java.util.ArrayList;

public class Arvore<T> {

    private No<T> raiz;

    public Arvore(T raiz) {
        this.raiz = new No<T>(raiz);
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void adicionarFilho(T pai, T filho) {
        No<T> noPai = buscarNo(raiz, pai);
        noPai.adicionarFilho(new No<T>(filho));
    }

    private No<T> buscarNo(No<T> no, T valor) {
        if (no.getValor().equals(valor)) {
            return no;
        } else {
            for (No<T> filho : no.getFilhos()) {
                No<T> noEncontrado = buscarNo(filho, valor);
                if (noEncontrado != null) {
                    return noEncontrado;
                }
            }
            return null;
        }
    }

    public ArrayList<No<T>> getNos() {
        ArrayList<No<T>> nos = new ArrayList<No<T>>();
        adicionarNos(raiz, nos);
        return nos;
    }

    private void adicionarNos(No<T> no, ArrayList<No<T>> nos) {
        nos.add(no);
        for (No<T> filho : no.getFilhos()) {
            adicionarNos(filho, nos);
        }
    }
}