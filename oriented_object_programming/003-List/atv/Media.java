package atv;

public class Media {
    double media1, media2, mediasSum, mediasMedia;
    public Media(){
        this.calc();
    }

    public void calc(){
        this.media1 = (double) (8 + 9 + 7) / 3;
        this.media2 = (double) (4 + 5 + 6) / 3;
        this.mediasSum = this.media1 + this.media2;
        this.mediasMedia = this.mediasSum / 2;

        System.out.println("Media 1 = " + this.media1);
        System.out.println("Media 2 = " + this.media2);
        System.out.println("Media's Sum = " + this.mediasSum);
        System.out.println("Media's media = " + this.mediasMedia);
    }
}
