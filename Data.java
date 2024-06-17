package dia_mes_ano;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        this(1, 1, 1910);
    }
    
    public Data(int dia) {
        this(dia, 1, 1910);
    }
    
    public Data(int dia, int mes) {
        this(dia, mes, 1910);
    }
    
    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    private boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }
    
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return ehBissexto(ano) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    public String format1() {
        return String.format("%02d/%02d/%02d", dia, mes, ano % 100);
    }
    
    public String format2() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
    public String format3() {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                          "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        return String.format("%02d de %s de %04d", dia, meses[mes - 1], ano);
    }
}
