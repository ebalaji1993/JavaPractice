public class Garb {
    public static void main(String[] args) {

        int a = 0;

        Garb gobj = new Garb();

        gobj = null;

        System.gc();
        System.out.println("End of Garbage Collection");
       


        protected void finalize()   
         {

            System.out.println("Garbage is done:");
        }
        

        
    }
}
