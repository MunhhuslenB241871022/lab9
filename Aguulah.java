import java.util.Date;
import java.util.List;

class Aguulah {
    private String ner;
    private Nyarav nyarav;
    private List<Baraa> baraanuud;
}

class Nyarav {
    private String ner;
    private Aguulah aguulah;

    public void orlogoHiih(OrlogiinPadaan padaan) {}
    public void zarlagaHiih(ZarlagiinPadaan padaan) {}
    public void tailanUzeh(Date ehlehOgnoo, Date duusahOgnoo, List<Baraa> songogdsonBaraanuud) {}
    public void toollogoHiih(Baraa baraa, int boditToo, Date toollogoOgnoo) {}
}

class Baraa {
    private String ner;
    private int too;
}

class OrlogiinPadaan {
    private Date ognoo;
    private List<Baraa> baraanuud;
    private String huleelgenOgogch;

    public void hewleh() {}
}

class ZarlagiinPadaan {
    private Date ognoo;
    private List<Baraa> baraanuud;
    private String huleenAvagch;

    public void hewleh() {}
}

class Tailan {
    private Date ehlehOgnoo;
    private Date duusahOgnoo;
    private List<Baraa> baraanuud;
    private int ehniiUldegdel;
    private int niitOrlogo;
    private int niitZarlaga;
    private int etssiinUldegdel;

    public void haruulah() {}
}

class Toollogo {
    private Baraa baraa;
    private Date ognoo;
    private int boditToo;
    private int zohihToo;

    public void shinechlehToo() {}
}
