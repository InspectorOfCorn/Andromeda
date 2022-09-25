public class TrynCatchHands {
    public static void main(String[] args) {
// Null pointer exception
        String s = "";
        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Pointer: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out of bounds: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I don't know what happened: " + e.getMessage());
        }
        System.out.println("I'm not dead yet! ");
    }
// So cool for debugging!
}
