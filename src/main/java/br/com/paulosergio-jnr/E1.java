package br.com.paulosergio-jnr;

import com.sun.jna.Library;

private interface E1 extends Library {
    int AbreConexaoImpressora(int tipo, String modelo, String conexao, int parametro);

    int FechaConexaoImpressora();

    int Corte(int i);

    int ImpressaoTexto(String dados, int posicao, int stilo, int tamanho);

    int StatusImpressora(int param);

    int AvancaPapel(int linhas);

    int InicializaImpressora();
}
