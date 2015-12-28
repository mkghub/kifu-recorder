package br.edu.ifspsaocarlos.sdm.kifurecorder.jogo;

import java.util.HashSet;
import java.util.Set;

public class Grupo {

    private int cor;
    private Set<Posicao> posicoes;
    private Set<Posicao> liberdades;

    public Grupo() {
        cor = Tabuleiro.PEDRA_PRETA;
        posicoes = new HashSet<>();
        liberdades = new HashSet<>();
    }

    public Grupo(int cor) {
        this.cor = cor;
        posicoes = new HashSet<>();
        liberdades = new HashSet<>();
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public Set<Posicao> getPosicoes() {
        return posicoes;
    }

    public Set<Posicao> getLiberdades() {
        return liberdades;
    }

    public void adicionarPosicao(Posicao posicao) {
        posicoes.add(posicao);
    }

    public void adicionarLiberdade(Posicao liberdade) {
        liberdades.add(liberdade);
    }

    @Override
    public boolean equals(Object outro) {
        if (!(outro instanceof Grupo)) {
            return false;
        }

        Grupo outroGrupo = (Grupo) outro;
        return cor == outroGrupo.cor &&
                posicoes.equals(outroGrupo.posicoes) &&
                liberdades.equals(outroGrupo.liberdades);
    }

    @Override
    public int hashCode() {
        return cor + posicoes.hashCode() + liberdades.hashCode();
    }
}
