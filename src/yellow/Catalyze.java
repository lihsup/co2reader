package yellow;

public class Catalyze {

    public static void main(String[] args) {
    Writeback writeback = new Writeback();

    Readback callback = new Readback();	
    double d1 = callback.getamount("idCO2","2017-03-"+args[0], "00:00:00", args[2]);
    double d2 = callback.getamount("idCO2","2017-03-"+args[1], "21:00:00", args[2]);
        double d3 = callback.getamount("idCO2","2017-03-"+args[0], "00:00:00", args[2]);
        double d4 = callback.getamount("idCO2","2017-03-"+args[1], "21:00:00", args[2]);
    double i,sum=0;
    for(i=d1;i<d2+1;i=i+4){
    	sum = sum + callback.idgetdensity(i);
    }
    sum = 4 * sum / (i-d1);
        writeback.Writevalue(args[3], sum);


    double j,res=0;
    for(j=d3;j<d4+1;j=j+4){
        if( callback.idgetdensity(j)>res )
            res = callback.idgetdensity(j);
    }
        int er = Integer.parseInt(args[3]) + 1;
    writeback.Writevalue(Integer.toString(er), res);
    System.out.println("Expected result:"+sum+res+"(It will be hidden in final version)\n");
       
    }
    

}
