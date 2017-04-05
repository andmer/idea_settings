#parse("Header.java")
package ${PACKAGE_NAME};
import com.fxcm.entity.ICode;
import com.fxcm.entity.ACode;
import com.fxcm.messaging.IMessage;
import com.fxcm.messaging.ITransportable;
import com.fxcm.messaging.IMessageFactory;
import com.fxcm.fix.IFixDefs;

import java.io.Serializable;
#parse("File Header.java")
public class ${NAME} implements ITransportable, IFixDefs {

    public static final ICode OBJ_TYPE = new  ${NAME}Type();

    private static class  ${NAME}Type extends ACode {
         ${NAME}Type() {
            super(MSGTYPE_, " ${NAME}Type", "");
        }
    }

    private String mTradingSessionID; //336 
    private String mTradingSessionSubID; //625           

    public boolean fill(IMessage aMsg) {
        reset();
        setTradingSessionID(aMsg.getValueString(FLDTAG_TRADINGSESSIONID));
        setTradingSessionSubID(aMsg.getValueString(FLDTAG_TRADINGSESSIONSUBID));
        return isValid();
    }

    public String getRequestID() {
        return null;
    }

    public String getTradingSessionID() {
        return mTradingSessionID;
    }

    public void setTradingSessionID(String aTradingSessionID) {
        mTradingSessionID = aTradingSessionID;
    }

    public String getTradingSessionSubID() {
        return mTradingSessionSubID;
    }

    public void setTradingSessionSubID(String aTradingSessionSubID) {
        mTradingSessionSubID = aTradingSessionSubID;
    }


    public ICode getType() {
        return OBJ_TYPE;
    }

    public boolean isValid() {
        return true;
    }

    private void reset() {
    }

    public IMessage toMessage(String aSID, IMessageFactory aFactory) {
        IMessage ret = aFactory.createMessage(aSID, MSGTYPE_);
        ret.setValue(FLDTAG_TRADINGSESSIONID, getTradingSessionID());
        ret.setValue(FLDTAG_TRADINGSESSIONSUBID, getTradingSessionSubID());
        return ret;
    }

    public boolean update(IMessage aMsg) {
        return fill(aMsg);
    }
}