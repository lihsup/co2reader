package yellow;

public class MainActivity {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
	CallbackCo2 callback = new CallbackCo2();
	Writeback writeback = new Writeback();
	Double d = callback.FindAverage(args[0], args[1], args[2]);
    System.out.println("Expected result:"+d+"(It will be hidden in final version)\n");
    writeback.Writevalue(args[3], d);
    }
    

}
