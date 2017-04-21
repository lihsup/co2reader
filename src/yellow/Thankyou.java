package yellow;

public class Thankyou {

    public static void main(String[] args) {
//	CallbackCo2 callback = new CallbackCo2();
    Writeback writeback = new Writeback();
//	Double d = callback.FindAverage(args[0], args[1], args[2]);
//    System.out.println("Expected result:"+d+"(It will be hidden in final version)\n");

    Readback callback = new Readback();	
    long begintime = System.currentTimeMillis();
    double i,sum=0;
    for(i=0;i<800;i=i+1){
    	callback.idgetdensity(5.0);
    }
    long endtime = System.currentTimeMillis();
    writeback.Writevalue(args[3], 255);
    System.out.println("time: "+ (endtime -begintime) +"ms");
    }
    

}
