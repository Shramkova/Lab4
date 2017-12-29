package box;

public abstract class Peremennie {
    Integer Day,Month,Year,Hour,Minut;
    String Ot,Komu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peremennie that = (Peremennie) o;

        if (Day != null ? !Day.equals(that.Day) : that.Day != null) return false;
        if (Month != null ? !Month.equals(that.Month) : that.Month != null) return false;
        if (Year != null ? !Year.equals(that.Year) : that.Year != null) return false;
        if (Hour != null ? !Hour.equals(that.Hour) : that.Hour != null) return false;
        if (Minut != null ? !Minut.equals(that.Minut) : that.Minut != null) return false;
        if (Ot != null ? !Ot.equals(that.Ot) : that.Ot != null) return false;
        return Komu != null ? Komu.equals(that.Komu) : that.Komu == null;
    }

    @Override
    public int hashCode() {
        int result = Day != null ? Day.hashCode() : 0;
        result = 31 * result + (Month != null ? Month.hashCode() : 0);
        result = 31 * result + (Year != null ? Year.hashCode() : 0);
        result = 31 * result + (Hour != null ? Hour.hashCode() : 0);
        result = 31 * result + (Minut != null ? Minut.hashCode() : 0);
        result = 31 * result + (Ot != null ? Ot.hashCode() : 0);
        result = 31 * result + (Komu != null ? Komu.hashCode() : 0);
        return result;
    }

    public Integer getDay() {
        return Day;
    }

    public void setDay(Integer day) {
        Day = day;
    }

    public Integer getMonth() {
        return Month;
    }

    public void setMonth(Integer month) {
        Month = month;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Integer getHour() {
        return Hour;
    }

    public void setHour(Integer hour) {
        Hour = hour;
    }

    public Integer getMinut() {
        return Minut;
    }

    public void setMinut(Integer minut) {
        Minut = minut;
    }

    public String getOt() {
        return Ot;
    }

    public void setOt(String ot) {
        Ot = ot;
    }

    public String getKomu() {
        return Komu;
    }

    public void setKomu(String komu) {
        Komu = komu;
    }

}
