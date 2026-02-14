package ProgOrientadaObjectes.Scheduler;

public class SRJF extends Scheduler{

    public SRJF(){
        super();
        setPolitica(POLITICA.SJF);
    }

    public Proces getCurrentProces(){
        return getShortestRemainingProces();
    }

    public Proces getShortestRemainingProces(){
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i = 0; i<numProcesos; i++){
            if(procesos[i].numPendingCicles<minCicles){
                minCicles = procesos[i].numPendingCicles;
                shortest = procesos[i];
            }
        }
        return shortest;
    }
}
