public class OgrenciTest {
    public static void main(String[] args) {
        // Java'da obje oluşturma bu şekilde.
        Ogrenci ogr = new Ogrenci();

        ogr.setNo(1);
        ogr.setAd("Aziz");
        ogr.setSoyad("Sancar");
        ogr.getDogumyeri("Mardin");
        ogr.setHarc(1500);


        System.out.println(ogr.getNo() + "_" + ogr.getAd()+""+
                ogr.getSoyad()+ " " +ogr.getHarc());

        ogr.setHarc(2000);

        System.out.println(ogr.getNo() + "_" + ogr.getAd()+""+
                ogr.getSoyad()+ " " +ogr.getHarc());



    }
}
