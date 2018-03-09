package robo;

public class CamposSelenium {
    
    private String campo;
    private int posicao_x;
    private int posicao_y;
    private String tipo;
    private String campo_sem_formatacao;

    public CamposSelenium(String campo, int posicao_x, int posicao_y, String tipo, String campo_sem_formatcao)
    {
        this.campo = campo;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.tipo = tipo;
        this.campo_sem_formatacao = campo_sem_formatcao;
    }
    public CamposSelenium(){};
   
    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public int getPosicao_x() {
        return posicao_x;
    }

    /**
     * @param posicao_x the posicao_x to set
     */
    public void setPosicao_x(int posicao_x) {
        this.posicao_x = posicao_x;
    }

    public int getPosicao_y() {
        return posicao_y;
    }

    public void setPosicao_y(int posicao_y) {
        this.posicao_y = posicao_y;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public String getCampo_sem_formatacao() {
        return campo_sem_formatacao;
    }

    
    public void setCampo_sem_formatacao(String campo_sem_formatacao) {
        this.campo_sem_formatacao = campo_sem_formatacao;
    }
    
    
    
}
