package yellow;

public class MainActivity {

    public static void main(String[] args) {
//	CallbackCo2 callback = new CallbackCo2();
    Writeback writeback = new Writeback();
//	Double d = callback.FindAverage(args[0], args[1], args[2]);
//    System.out.println("Expected result:"+d+"(It will be hidden in final version)\n");

    Readback callback = new Readback();	
    double d1 = callback.getamount("idCO2","2017-03-"+args[0], "00:00:00", args[2]);
    double d2 = callback.getamount("idCO2","2017-03-"+args[1], "21:00:00", args[2]);
    double i,sum=0;
    for(i=d1;i<d2+1;i=i+4){
    	sum = sum + callback.idgetdensity(i);
    }
    sum = 4 * sum / (i-d1);
    writeback.Writevalue(args[3], sum);
    System.out.println("Expected result:"+sum+"(It will be hidden in final version)\n");
       
    }
    

}
