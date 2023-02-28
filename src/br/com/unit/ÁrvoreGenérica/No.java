/* Aluno: Gabriel Cruz Araujo 
   Aluno: Edson Augusto	
*/
package br.com.unit.ÁrvoreGenérica;

import java.util.ArrayList;

public class No<T> {

    private T valor;
    private No<T> pai;
    private ArrayList<No<T>> filhos;

    public No(T valor) {
        this.valor = valor;
        this.pai = null;
        this.filhos = new ArrayList<No<T>>();
    }

    public T getValor() {
        return valor;
    }

    public No<T> getPai() {
        return pai;
    }

    public void setPai(No<T> pai) {
        this.pai = pai;
    }

    public ArrayList<No<T>> getFilhos() {
        return filhos;
    }

    public void adicionarFilho(No<T> filho) {
        filho.setPai(this);
        filhos.add(filho);
    }

    public boolean isFolha() {
        return filhos.isEmpty();
    }

    public int getGrau() {
        return filhos.size();
    }

    public int getAltura() {
        int alturaMax = 0;
        for (No<T> filho : filhos) {
            int alturaFilho = filho.getAltura();
            if (alturaFilho > alturaMax) {
                alturaMax = alturaFilho;
            }
        }
        return alturaMax + 1;
    }

    public int getProfundidade() {
        int profundidade = 0;
        No<T> no = this;
        while (no.getPai() != null) {
            profundidade++;
            no = no.getPai();
        }
        return profundidade;
    }

    public int getNivel() {
        int nivel = 0;
        No<T> no = this;
        while (no.getPai() != null) {
            nivel++;
            no = no.getPai();
        }
        return nivel;
    }

    public ArrayList<No<T>> getSubArvore() {
        ArrayList<No<T>> subArvore = new ArrayList<No<T>>();
        adicionarNos(this, subArvore);
        return subArvore;
    }

    private void adicionarNos(No<T> no, ArrayList<No<T>> nos) {
        nos.add(no);
        for (No<T> filho : no.getFilhos()) {
            adicionarNos(filho, nos);
        }
    }

}
