package ProgOrientadaObjectes.Scheduler;

public class FIFO extends Scheduler{

    public FIFO(){
        super();
        setPolitica(POLITICA.FIFO);
    }

    public Proces getCurrentProces(){ return procesos[0]; }
}
