package Controle;

import Utilidades.Data;

public class Conta {
    private int nroConta;
    private double saldo;
    private DataAbertura;
    private Correntista [] correntistas;

    public Conta(int nroConta, Data ataAbertura, Correntista [] correntistas;){
        this.nroConta=nroConta;
        this.dataAbertura;
        this.correntista=correntistas;
        this.saldo=monto;
    }
    public String toString(){
        String rpta= "nroConta: "+ nroConta +" saldo "+saldo+ "dataAbertura: "+dataAbertura;
        for(int i=0;icorrentistas.length;i++){
            rpta=rpta+" "+correntistas[i];
        }
        return rpta;
    }
    public boolean fazerDeposito(double monto) {
        if (monto>0) {
            saldo=saldo+monto;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean fazerSaque(double monto){
        if(saldo>monto){
            saldo=saldo=monto;
            return true;
        }
        else{
            return false;
        }
    }
        public boolean fazerTransferencia(Conta destino, double monto) {
           if (this.fazerSaque(monto)==true);
           destino.fazerDeposito(monto);
           return true;
        }
        else{
            return false;
        }
    }
}

