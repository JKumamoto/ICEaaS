package ci1.cics.iceaas.Model;

public class Transaction {
    
    private String name;
    private String user;
    private String description;
    private String data;

    private int freq;

    private boolean retry;
    private boolean domingo;
    private boolean segunda;
    private boolean terca;
    private boolean quarta;
    private boolean quinta;
    private boolean sexta;
    private boolean sabado;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getFreq() {
        return freq;
    }
    public void setFreq(int freq) {
        this.freq = freq;
    }
    public boolean isRetry() {
        return retry;
    }
    public void setRetry(boolean retry) {
        this.retry = retry;
    }
    public boolean isDomingo() {
        return domingo;
    }
    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }
    public boolean isSegunda() {
        return segunda;
    }
    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }
    public boolean isTerca() {
        return terca;
    }
    public void setTerca(boolean terca) {
        this.terca = terca;
    }
    public boolean isQuarta() {
        return quarta;
    }
    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }
    public boolean isQuinta() {
        return quinta;
    }
    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }
    public boolean isSexta() {
        return sexta;
    }
    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }
    public boolean isSabado() {
        return sabado;
    }
    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

}
