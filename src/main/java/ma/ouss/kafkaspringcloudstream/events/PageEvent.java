package ma.ouss.kafkaspringcloudstream.events;

import java.util.Date;

/**
 * @author $ {USER}
 **/
public record PageEvent(String name , String user, Date date,long duration ) {
}
