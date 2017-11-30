package organism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Organism {

    DateFormat dateFormat = new SimpleDateFormat("(dd-MM-yy)HH.mm.ss");
    Date date = new Date();

    public Date alive() {
        return date;
    }
}
