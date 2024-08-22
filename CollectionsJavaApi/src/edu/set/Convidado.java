package edu.set;

public class Convidado {
    private String nome;
    private int codigoDoConvite;

    public Convidado(String nome, int codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigoDoConvite() {
        return this.codigoDoConvite;
    }

    @Override
    public String toString() {
        return "Convidado { Nome: " + this.nome + " Codigo Convite: " + this.codigoDoConvite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoDoConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoDoConvite != other.codigoDoConvite)
            return false;
        return true;
    }

}
