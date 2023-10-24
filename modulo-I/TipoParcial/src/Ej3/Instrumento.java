package Ej3;

public abstract class Instrumento {
    protected TipoAfinacion afinacion = TipoAfinacion.DO;

    public abstract void tocar();

    public void setAfinacion(TipoAfinacion afinacion) {
        this.afinacion = afinacion;
    }

    public TipoAfinacion getAfinacion(){
        return afinacion;
    }
}
