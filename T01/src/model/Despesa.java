package model;

public class Despesa extends Movimento {

    private TipoGasto tipoGasto;

    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(TipoGasto tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

}
