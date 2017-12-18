package net.zoneland.gateway.comm.smgp.message;

import net.zoneland.gateway.comm.smgp.SMGPConstant;
import net.zoneland.gateway.util.TypeConvert;

public class SMGPMtRouteUpdateRespMessage extends SMGPMessage
{

    public SMGPMtRouteUpdateRespMessage(byte buf[])
        throws IllegalArgumentException
    {
        super.buf = new byte[5];
        if(buf.length != 5)
        {
            throw new IllegalArgumentException(SMGPConstant.SMC_MESSAGE_ERROR);
        } else
        {
            System.arraycopy(buf, 0, super.buf, 0, 5);
            super.sequence_Id = TypeConvert.byte2int(super.buf, 0);
            return;
        }
    }

    public int getStatus()
    {
        return super.buf[4];
    }

    public String toString()
    {
        StringBuffer strBuf = new StringBuffer(100);
        strBuf.append("SMGPMtRouteUpdateRespMessage: ");
        strBuf.append("Sequence_Id=".concat(String.valueOf(String.valueOf(getSequenceId()))));
        strBuf.append(",Status=".concat(String.valueOf(String.valueOf(getStatus()))));
        return strBuf.toString();
    }

    public int getRequestId()
    {
        return 0x80000008;
    }
}
