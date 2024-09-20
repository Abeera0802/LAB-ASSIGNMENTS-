
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!!");
        Artist Rohan = new Artist("Afra");
        Artwork A = new Artwork("sky",2024,Rohan);
        A.print();
        System.out.println();

        // Example of shallow copy
        Artwork B = A;
        B.print();
        System.out.println();

        // Example of deep Copy
        Artwork C = new Artwork(A);
        C.getArtist().setName("Hareem Fatima");
        C.print();
        System.out.println();
        A.print();
        }
}