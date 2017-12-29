package box;

public class Poisk_po_date extends Peremennie {
    public Poisk_po_date (String ot, String komu,Integer day, Integer month, Integer year, Integer hour, Integer minut) {
        this.Day = day;
        this.Month = month;
        this.Year = year;
        this.Hour = hour;
        this.Minut = minut;
        this.Ot = ot;
        this.Komu = komu;
    }
    @Override
    public String toString() {
        return"" + Day + "" + Month +"" + Year +"" + Hour +"" + Minut +"" + Ot  +"" + Komu +"";
    }
}
