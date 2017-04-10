package yellow;

public class Goodmorning {

    public static void main(String[] args) {
//	CallbackCo2 callback = new CallbackCo2();
        Writeback writeback = new Writeback();
//	Double d = callback.FindAverage(args[0], args[1], args[2]);
//    System.out.println("Expected result:"+d+"(It will be hidden in final version)\n");

        Readback callback = new Readback();
        double d1 = callback.getamount("idCO2","2017-03-"+args[0], "00:00:00", args[2]);
        double d2 = callback.getamount("idCO2","2017-03-"+args[1], "21:00:00", args[2]);
        double i,res=0;
        for(i=d1;i<d2+1;i=i+4){
            if( callback.idgetdensity(i)>res )
                res = callback.idgetdensity(i);
        }

        writeback.Writevalue(args[3], res);
        System.out.println("Expected result:"+res+"(It will be hidden in final version)\n");

    }


}
