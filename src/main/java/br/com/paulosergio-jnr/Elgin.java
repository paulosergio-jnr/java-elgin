package br.com.paulosergio-jnr;

import com.sun.jna.Native;

private static class ElginPrinter {
    private E1 e1;

    public void loadE1() {
        e1 = (E1) Native.loadLibrary("C:\\Users\\miste\\Downloads\\elgin\\E1_Impressora01.dll", E1.class);
        System.err.println("Biblioteca carregada");
    }

    public void abreConexao() {
        int retorno = e1.AbreConexaoImpressora(3, "i8", "192.168.0.33", 9100);
        System.out.println("Abre Conexão => " + retorno);
    }

    public void escreve(final String texto) {
        int retorno = e1.ImpressaoTexto(texto, 0, 0, 0);
        System.out.println("Escreve texto => " + retorno);

        retorno = e1.AvancaPapel(5);
        System.out.println("Escreve texto => " + retorno);
    }

    public void corta() {
        int retorno = e1.Corte(1);
        System.out.println("Corte => " + retorno);
    }

    public void fechaConexao() {
        int retorno = e1.FechaConexaoImpressora();
        System.out.println("Fecha conexão ==> " + retorno);
    }

    public void inicializaImpressora() {
        int retorno = e1.InicializaImpressora();
        System.out.println("Inicialização ==> " + retorno);
    }
}